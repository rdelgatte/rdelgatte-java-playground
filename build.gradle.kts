plugins {
  id("java")
}

group = "com.decathlon"
version = "1.0-SNAPSHOT"


val junitVersion = "5.9.0"
val junitQuickCheckVersion = "1.0"
val junitQuickCheckVavrVersion = "2.0"
val vavrVersion = "0.10.4"
val assertjVersion = "3.23.1"
val mockitoVersion = "4.2.0"

repositories {
  mavenCentral()
}

dependencies {
  implementation("io.vavr:vavr:$vavrVersion")
  testImplementation("org.junit.jupiter:junit-jupiter-engine:$junitVersion")
  testImplementation("org.junit.jupiter:junit-jupiter-api:$junitVersion")
  testImplementation("org.junit.jupiter:junit-jupiter-params:$junitVersion")
  testImplementation("org.junit.vintage:junit-vintage-engine:$junitVersion")
  testImplementation("com.pholser:junit-quickcheck-core:$junitQuickCheckVersion")
  testImplementation("com.pholser:junit-quickcheck-generators:$junitQuickCheckVersion")
  testImplementation("org.assertj:assertj-core:$assertjVersion")
}

tasks.getByName<Test>("test") {
  useJUnitPlatform()
}
