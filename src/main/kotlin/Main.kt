import kotlinx.cli.ArgParser
import kotlinx.cli.ArgType
import kotlinx.cli.default
import kotlinx.cli.required
import java.nio.file.Paths

const val pcsUrl = "https://www.procyclingstats.com"

fun main(args: Array<String>) {
    val (season, cachePath, output, format, skipCache) = getAppArgs(args)

    val cache = cachePath?.let { Cache(Paths.get(it)) }
    val docFetcher = DocFetcher(cache, skipCache)
    val pcsParser = PCSParser(docFetcher, pcsUrl)

    val teamsAndRiders = GetTeamsAndRiders(pcsParser = pcsParser)(season = season)

    val exporter: Exporter = Exporter.from(output, format)
    exporter.export(teamsAndRiders)
}

private data class AppArgs(
    val season: Int,
    val cachePath: String?,
    val output: String,
    val format: Format,
    val skipCache: Boolean,
)

private fun getAppArgs(args: Array<String>): AppArgs {
    val parser = ArgParser("pcs-scrapper")
    val season by parser.option(ArgType.Int, shortName = "s", description = "Season").required()
    val cachePath by parser.option(ArgType.String, shortName = "c", description = "Cache path")
    val output by parser.option(ArgType.String, shortName = "o", description = "Output file path").required()
    val format by parser.option(
        ArgType.Choice(Format.values().map { it.name.lowercase() }, { it }),
        shortName = "f",
        description = "Output file format"
    ).required()
    val skipCache by parser.option(ArgType.Boolean, shortName = "sc", description = "Skip cache").default(false)
    parser.parse(args)
    return AppArgs(
        season = season,
        cachePath = cachePath,
        output = output,
        format = Format.valueOf(format.uppercase()),
        skipCache = skipCache,
    )
}