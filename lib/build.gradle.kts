plugins {
    `java-library`
    id("maven-publish")
}

group = "pw.vodes"
version = "0.1"

repositories {
    mavenCentral()
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(8))
    }
}

publishing {
    publications {
        create<MavenPublication>("release") {
            groupId = "pw.vodes"
            artifactId = "pircbot"
            version = "0.1"

            from(components["java"])
        }
    }
}

