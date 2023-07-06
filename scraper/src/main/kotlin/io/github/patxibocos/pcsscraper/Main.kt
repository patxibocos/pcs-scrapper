package io.github.patxibocos.pcsscraper

import io.github.patxibocos.pcsscraper.document.Cache
import io.github.patxibocos.pcsscraper.document.DocFetcher
import io.github.patxibocos.pcsscraper.export.Exporter
import io.github.patxibocos.pcsscraper.export.Format
import io.github.patxibocos.pcsscraper.scraper.PCSRacesScraper
import io.github.patxibocos.pcsscraper.scraper.PCSRidersScraper
import io.github.patxibocos.pcsscraper.scraper.PCSTeamsScraper
import io.github.patxibocos.pcsscraper.scraper.RacesScraper
import io.github.patxibocos.pcsscraper.scraper.RidersScraper
import io.github.patxibocos.pcsscraper.scraper.TeamsScraper
import kotlinx.cli.ArgParser
import kotlinx.cli.ArgType
import kotlinx.cli.default
import kotlinx.cli.multiple
import kotlinx.cli.required
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout
import mu.KotlinLogging
import org.slf4j.Logger
import java.nio.file.Paths
import kotlin.time.Duration

fun main(args: Array<String>) {
    val appArgs = getAppArgs(args)
    val (season, cachePath, destination, formats, skipCache, scrapTimeout, retryDelay) = appArgs

    val scrapTimeoutDuration = Duration.parse(scrapTimeout)
    val retryDelayDuration = Duration.parse(retryDelay)

    val cache = cachePath?.let { Cache(Paths.get(it)) }
    val docFetcher = DocFetcher(cache, skipCache, retryDelayDuration)
    val teamsScraper: TeamsScraper = PCSTeamsScraper(docFetcher)
    val ridersScraper: RidersScraper = PCSRidersScraper(docFetcher)
    val racesScraper: RacesScraper = PCSRacesScraper(docFetcher)

    runBlocking {
        val logger: Logger = KotlinLogging.logger {}

        logger.info("Running scraper with arguments: $appArgs")
        val data = async {
            val teams = teamsScraper.scrapeTeams(season = season)
            val riders = ridersScraper.scrapeRiders(season = season)
            val teamIdMapper = { teamId: String ->
                when {
                    teams.map { it.id }.contains(teamId) -> teamId
                    teamId == "team-dsm-2023" -> "team-dsm-firmenich-2023"
                    teamId == "trek-segafredo-2023" -> "lidl-trek-2023"
                    teamId == "team-corratec-2023" -> "team-corratec-selle-italia-2023"
                    teamId == "unisa-australia-2023" -> null
                    else -> throw IllegalArgumentException("Unexpected team id: $teamId")
                }
            }
            val races = racesScraper.scrapeRaces(season = season, teamIdMapper = teamIdMapper)
            Triple(teams, riders, races)
        }

        val (teams, riders, races) = withTimeout(scrapTimeoutDuration) {
            data.await()
        }

        formats.map { format ->
            val exporter: Exporter = Exporter.from(destination, format)
            logger.info("Exporting to $format")
            async { exporter.export(teams, riders, races) }
        }.awaitAll()
    }
}

private data class AppArgs(
    val season: Int,
    val cachePath: String?,
    val destination: String,
    val formats: List<Format>,
    val skipCache: Boolean,
    val scrapTimeout: String,
    val retryDelay: String,
)

private fun getAppArgs(args: Array<String>): AppArgs {
    val parser = ArgParser("pcs-scraper")
    val season by parser.option(ArgType.Int, shortName = "s", description = "Season").required()
    val cachePath by parser.option(ArgType.String, shortName = "c", description = "Cache path")
    val destination by parser.option(ArgType.String, shortName = "d", description = "Destination path").default("out")
    val formats by parser.option(
        ArgType.Choice(Format.values().map { it.name.lowercase() }, { it }),
        shortName = "f",
        description = "Output file format",
    ).required().multiple()
    val skipCache by parser.option(ArgType.Boolean, shortName = "sc", description = "Skip cache").default(false)
    val scrapTimeout by parser.option(ArgType.String, shortName = "st", description = "Scrap timeout").default("20m")
    val retryDelay by parser.option(ArgType.String, shortName = "rd", description = "Retry delay").default("1s")
    parser.parse(args)
    return AppArgs(
        season = season,
        cachePath = cachePath,
        destination = destination,
        formats = formats.map { Format.valueOf(it.uppercase()) },
        skipCache = skipCache,
        scrapTimeout = scrapTimeout,
        retryDelay = retryDelay,
    )
}
