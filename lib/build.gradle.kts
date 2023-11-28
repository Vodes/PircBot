plugins {
    `java-library`
    id("maven-publish")
}

group = "pw.vodes"
version = "0.1"

repositories {
    mavenCentral()
}

dependencies {
    // https://mvnrepository.com/artifact/commons-configuration/commons-configuration
    implementation("commons-configuration:commons-configuration:1.10")
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

