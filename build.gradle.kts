import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.20" apply false
}

group = "com.onejkspark"
version = "1.0-SNAPSHOT"

allprojects {

    repositories {
        mavenCentral()
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "11"
        }
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }
}


subprojects {

    apply(plugin = "java")
    apply(plugin = "kotlin")

    dependencies {
        "implementation"("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
        "testImplementation"(kotlin("test"))
        "testImplementation"(kotlin("reflect"))
//
//        implementation("org.jetbrains.kotlin:kotlin-reflect")
//        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    }
}
