import org.openapitools.generator.gradle.plugin.tasks.GenerateTask

plugins {
    kotlin("jvm") version "2.1.0"
    id("org.openapi.generator") version "7.11.0"
}

group = "ac.leap"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.18.2")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.18.2")
    implementation("com.squareup.okhttp3:okhttp:4.12.0")

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}

sourceSets.main {
    java.srcDirs(
        "${projectDir}/generated-sources/openapi/src/main/kotlin",
    )
}

tasks.register<GenerateTask>("openApiGenerateClient") {
    description = "Generates the client API types based upon the defined OpenAPI schema"
    group = "build"
    generatorName.set("kotlin")
    inputSpec.set("${projectDir}/src/main/resources/schema.yaml")
    outputDir.set("${projectDir}/generated-sources-client/openapi")
    cleanupOutput = true
    packageName.set("com.example.openapigenerator")
    configOptions.set(
        mapOf(
            "serializationLibrary" to "jackson",
        ),
    )
}

tasks.register<GenerateTask>("openApiGenerateKotlinServer") {
    description = "Generates the server API types based upon the defined OpenAPI schema"
    group = "build"
    generatorName.set("kotlin-server")
    inputSpec.set("${projectDir}/src/main/resources/schema.yaml")
    outputDir.set("${projectDir}/generated-sources-kotlin-server/openapi")
    cleanupOutput = true
    library = "javalin6"
    packageName.set("com.example.openapigenerator")
    configOptions.set(
        mapOf(
            // This doesn't do anything on the kotlin-server generator
            "serializationLibrary" to "jackson",
        ),
    )
}

tasks.register<GenerateTask>("openApiGenerateKotlinSpring") {
    description = "Generates the server API types based upon the defined OpenAPI schema"
    group = "build"
    generatorName.set("kotlin-spring")
    inputSpec.set("${projectDir}/src/main/resources/schema.yaml")
    outputDir.set("${projectDir}/generated-sources-kotlin-spring/openapi")
    cleanupOutput = true
    packageName.set("com.example.openapigenerator")
    configOptions.set(
        mapOf(
            // This doesn't do anything on the kotlin-server generator
            "serializationLibrary" to "jackson",
            "useSpringBoot3" to "true",
        ),
    )
}
