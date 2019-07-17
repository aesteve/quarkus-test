plugins {
    // Apply the Kotlin JVM plugin to add support for Kotlin on the JVM.
    id("io.quarkus") version "0.19.1"
    idea
    java
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(enforcedPlatform("io.quarkus:quarkus-bom:0.19.1"))
    implementation("io.quarkus:quarkus-resteasy")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
}

