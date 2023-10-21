plugins {
  application apply true
}

dependencies {
  implementation("org.springframework:spring-core:5.3.22")
  testImplementation(kotlin("test"))
  testImplementation("org.assertj:assertj-core:3.21.0")
}

tasks.getByName("jar") {
  enabled = true
}

application {
  mainClass.set("MainKt")
}
