plugins {
    kotlin("jvm")
}

tasks.jar {
    enabled = true
}

dependencies {

    // https://mvnrepository.com/artifact/com.github.ben-manes.caffeine/caffeine
    implementation("com.github.ben-manes.caffeine:caffeine:3.1.8")
}
