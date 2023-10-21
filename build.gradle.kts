import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.20" apply false
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
        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
        implementation("org.jetbrains.kotlin:kotlin-reflect")
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
        implementation(kotlin("reflect"))
        testImplementation(kotlin("test"))
    }
}
