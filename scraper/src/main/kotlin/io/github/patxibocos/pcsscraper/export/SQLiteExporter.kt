package io.github.patxibocos.pcsscraper.export

import io.github.patxibocos.pcsscraper.entity.Race
import io.github.patxibocos.pcsscraper.entity.Rider
import io.github.patxibocos.pcsscraper.entity.Team
import kotlinx.serialization.json.Json
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.Table
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.statements.InsertStatement
import org.jetbrains.exposed.sql.transactions.transaction
import java.io.File
import java.time.format.DateTimeFormatter

internal class SQLiteExporter(destination: File) : Exporter {

    private val destinationFile = destination.resolve("db.sqlite").also { it.delete() }

    private fun <T> connectToDbAndInsert(
        table: DbTable<T>,
        data: List<T>,
        enricher: (InsertStatement<Number>) -> Unit = {},
    ) {
        Database.connect("jdbc:sqlite:${destinationFile.absolutePath}", "org.sqlite.JDBC")
        transaction {
            SchemaUtils.create(table)
            data.forEach { t: T ->
                table.insert {
                    enricher(it)
                    table.fillInsertStatement(it, t)
                }
            }
        }
    }

    private abstract class DbTable<T>(name: String) : Table(name = name) {
        abstract fun fillInsertStatement(insertStatement: InsertStatement<Number>, t: T)
    }

    private object DbTeam : DbTable<Team>(name = "team") {
        val id = text("id")
        private val name = text("name")
        private val status = text("status")
        private val abbreviation = text("abbreviation")
        private val country = text("country")
        private val bike = text("bike")
        private val jersey = text("jersey")
        private val website = text("website").nullable()
        private val year = integer("year")
        private val riders = text("riders")

        override val primaryKey: PrimaryKey
            get() = PrimaryKey(id, name = "id")

        override fun fillInsertStatement(insertStatement: InsertStatement<Number>, t: Team) {
            insertStatement[id] = t.id
            insertStatement[name] = t.name
            insertStatement[status] = t.status.name
            insertStatement[abbreviation] = t.abbreviation
            insertStatement[country] = t.country
            insertStatement[bike] = t.bike
            insertStatement[jersey] = t.jersey.toString()
            insertStatement[website] = t.website
            insertStatement[year] = t.year
            insertStatement[riders] = Json.encodeToString(t.riders)
        }
    }

    private object DbRider : DbTable<Rider>(name = "rider") {
        val id = text("id")
        private val firstName = text("first_name")
        private val lastName = text("last_name")
        private val country = text("country")
        private val website = text("website").nullable()
        private val birthDate = text("birth_date").nullable()
        private val birthPlace = text("birth_place").nullable()
        private val weight = integer("weight").nullable()
        private val height = integer("height").nullable()
        private val photo = text("photo")
        private val uciRankingPosition = integer("uci_ranking_position").nullable()

        override val primaryKey: PrimaryKey
            get() = PrimaryKey(id, name = "id")

        override fun fillInsertStatement(insertStatement: InsertStatement<Number>, t: Rider) {
            insertStatement[id] = t.id
            insertStatement[firstName] = t.firstName
            insertStatement[lastName] = t.lastName
            insertStatement[country] = t.country
            insertStatement[website] = t.website
            insertStatement[birthDate] = t.birthDate?.format(DateTimeFormatter.ISO_LOCAL_DATE)
            insertStatement[birthPlace] = t.birthPlace
            insertStatement[weight] = t.weight
            insertStatement[height] = t.height
            insertStatement[photo] = t.photo.toString()
            insertStatement[uciRankingPosition] = t.uciRankingPosition
        }
    }

    private object DbRace : DbTable<Race>(name = "race") {
        val id = text("id")
        private val name = text("name")
        private val country = text("country")
        private val website = text("website").nullable()

        override val primaryKey: PrimaryKey
            get() = PrimaryKey(id, name = "id")

        override fun fillInsertStatement(insertStatement: InsertStatement<Number>, t: Race) {
            insertStatement[id] = t.id
            insertStatement[name] = t.name
            insertStatement[country] = t.country
            insertStatement[website] = t.website
        }
    }

    private object DbStage : DbTable<Race.Stage>(name = "stage") {
        val id = text("id")
        private val startDateTime = text("start_date_time")
        private val distance = float("distance")
        private val profile_type = text("profile_type").nullable()
        private val departure = text("departure").nullable()
        private val arrival = text("arrival").nullable()
        private val stage_type = text("stage_type")
        val raceId = text("race_id") references DbRace.id

        override val primaryKey: PrimaryKey
            get() = PrimaryKey(id, name = "id")

        override fun fillInsertStatement(insertStatement: InsertStatement<Number>, t: Race.Stage) {
            insertStatement[id] = t.id
            insertStatement[startDateTime] = t.startDateTime.toString()
            insertStatement[distance] = t.distance
            insertStatement[profile_type] = t.profileType?.name
            insertStatement[departure] = t.departure
            insertStatement[arrival] = t.arrival
            insertStatement[stage_type] = t.stageType.name
        }
    }

    private object DbRiderParticipation :
        DbTable<Race.RiderParticipation>(name = "rider_participation") {
        val raceId = text("race_id") references DbRace.id
        val teamId = text("team_id") references DbTeam.id
        private val riderId = text("rider_id") references DbRider.id
        private val number = integer("number").nullable()

        override fun fillInsertStatement(insertStatement: InsertStatement<Number>, t: Race.RiderParticipation) {
            insertStatement[riderId] = t.rider
            insertStatement[number] = t.number
        }
    }

    private object DbStageResult :
        DbTable<Race.ParticipantResultTime>(name = "stage_result") {
        val phase = text("phase")
        val stageId = text("stage_id") references DbStage.id
        private val participantId = text("participant_id") // It can be either a rider or a team (for team time trials)
        private val position = integer("position")
        private val time = long("time")

        override fun fillInsertStatement(insertStatement: InsertStatement<Number>, t: Race.ParticipantResultTime) {
            insertStatement[participantId] = t.participant
            insertStatement[position] = t.position
            insertStatement[time] = t.time
        }
    }

    override suspend fun export(teams: List<Team>, riders: List<Rider>, races: List<Race>) {
        connectToDbAndInsert(DbRider, riders)
        connectToDbAndInsert(DbTeam, teams)
        connectToDbAndInsert(DbRace, races)
        races.forEach { race ->
            connectToDbAndInsert(DbStage, race.stages) {
                it[DbStage.raceId] = race.id
            }
            race.startList.forEach { team ->
                connectToDbAndInsert(DbRiderParticipation, team.riders) {
                    it[DbRiderParticipation.raceId] = race.id
                    it[DbRiderParticipation.teamId] = team.team
                }
            }
            race.stages.forEach { stage ->
                connectToDbAndInsert(DbStageResult, stage.stageResults.time) {
                    it[DbStageResult.stageId] = stage.id
                    it[DbStageResult.phase] = "stage"
                }
//                connectToDbAndInsert(DbStageResult, stage.stageResults.generalTime) {
//                    it[DbStageResult.stageId] = stage.id
//                    it[DbStageResult.phase] = "gc"
//                }
                connectToDbAndInsert(DbStageResult, stage.stageResults.youth) {
                    it[DbStageResult.stageId] = stage.id
                    it[DbStageResult.phase] = "youth"
                }
                connectToDbAndInsert(DbStageResult, stage.stageResults.teams) {
                    it[DbStageResult.stageId] = stage.id
                    it[DbStageResult.phase] = "teams"
                }
//                connectToDbAndInsert(DbStageResult, stage.results.kom) {
//                    it[DbStageResult.stageId] = stage.id
//                    it[DbStageResult.phase] = "kom"
//                }
//                connectToDbAndInsert(DbStageResult, stage.results.points) {
//                    it[DbStageResult.stageId] = stage.id
//                    it[DbStageResult.phase] = "points"
//                }
            }
        }
    }
}
