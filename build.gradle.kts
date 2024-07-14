

plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation ("com.google.code.gson:gson:2.8.9")

}

tasks.test {
    useJUnitPlatform()
}

jar {
    manifest {
        attributes(
            'Main-Class': 'org.example.Main' // Замініть на ваш головний клас
        )
    }
    from {
        configurations.compileClasspath.collect { it.isDirectory() ? it : zipTree(it) }
    }
}