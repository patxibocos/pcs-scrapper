plugins {
    application
    idea
    kotlin("jvm")
    kotlin("plugin.serialization") version "1.7.20"
}

group = "io.github.patxibocos"
version = "1.0-SNAPSHOT"

application {
    mainClass.set("io.github.patxibocos.pcsscraper.MainKt")
    applicationName = rootProject.name
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.aws.s3)
    implementation(libs.exposed.core)
    implementation(libs.exposed.jdbc)
    implementation(libs.firebase.admin)
    implementation(libs.kotlin.cli)
    implementation(libs.kotlin.logging)
    implementation(libs.kotlin.serialization.json)
    implementation(libs.log4j.api.kotlin)
    implementation(libs.log4j.core)
    implementation(libs.log4j.slf4j2.impl)
    implementation(libs.ktor.client.core)
    implementation(libs.ktor.client.cio)
    implementation(libs.skrapeit)
    implementation(libs.sqlite.jdbc)

    implementation(project(":common"))

    testImplementation(libs.test.kotest.assertions)
    testImplementation(libs.test.kotest.runner.junit5)
    testImplementation(libs.test.mockk)
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(11)
}

tasks.withType<Jar> {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
    manifest {
        attributes["Main-Class"] = application.mainClass
        archiveFileName.set("${project.name}.jar")
    }
    from(configurations.compileClasspath.get().map { if (it.isDirectory) it else zipTree(it) })
    exclude("META-INF/*.SF")
    exclude("META-INF/*.DSA")
}
