import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.20" apply false
    id("org.jlleitschuh.gradle.ktlint") version "10.2.1" apply true
    application
}

allprojects {

    group = "com.onejkspark"
    version = "1.0-SNAPSHOT"

    repositories {
        mavenCentral()
    }
}

subprojects {

    apply(plugin = "java")
    apply(plugin = "kotlin")
    apply(plugin = "org.jlleitschuh.gradle.ktlint")

    val implementation by configurations
    val testImplementation by configurations

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "17"
        }
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }

    dependencies {

        // 기본라이브러리
        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
        implementation("org.jetbrains.kotlin:kotlin-reflect")
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
        implementation(kotlin("reflect"))

        testImplementation(kotlin("test"))

//        implementation ("io.github.microutils:kotlin-logging:3.0.5")'
//        implementation("org.slf4j:slf4j-api:1.7.30")
//        implementation("ch.qos.logback:logback-classic:1.2.3")

        // 로그라이브러리
        val loggerJvmVersion = "2.0.10"
        val slf4jVersion = "1.7.30"
        implementation("org.slf4j:slf4j-api:$slf4jVersion")
        implementation("org.slf4j:slf4j-simple:$slf4jVersion")
        implementation("ch.qos.logback:logback-classic:1.2.3")
        implementation("io.github.microutils:kotlin-logging:2.0.6")
        implementation("io.github.microutils:kotlin-logging-jvm:$loggerJvmVersion")
    }
}
