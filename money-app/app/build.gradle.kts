plugins {
    kotlin("jvm") version "2.0.20"
    application
}

application {
    mainClass = "com.example.App"
}

repositories {
    mavenCentral()
    maven {
        url = uri("../../mvn-repo")
    }
}

dependencies {
    implementation("com.example:money-library:1.0")
    implementation(project(":greeter-library"))
}
