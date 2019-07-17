import io.quarkus.gradle.QuarkusPluginExtension

plugins {
    // Apply the Kotlin JVM plugin to add support for Kotlin on the JVM.
    id("org.jetbrains.kotlin.jvm") version("1.3.41")
    id("io.quarkus") version "0.19.1"
    idea
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(enforcedPlatform("io.quarkus:quarkus-bom:0.19.1"))
    implementation("io.quarkus:quarkus-resteasy")
    implementation("io.quarkus:quarkus-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
}

tasks.quarkusDev {
    setSourceDir(project.projectDir.resolve("src/main/kotlin").absolutePath)
    val quarkusPluginExtension = project.extensions.findByName("quarkus")as QuarkusPluginExtension
    println("Output directory before ${quarkusPluginExtension.outputDirectory()}")
    quarkusPluginExtension.setOutputDirectory(project.buildDir.resolve("classes/kotlin/main").absolutePath)
    println("Output directory after ${quarkusPluginExtension.outputDirectory()}")
}
