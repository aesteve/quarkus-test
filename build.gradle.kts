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
    implementation("io.quarkus:quarkus-resteasy-jsonb")
    implementation("io.quarkus:quarkus-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
}

quarkus {
    setSourceDir(project.projectDir.resolve("src/main/kotlin").absolutePath)
    setOutputDirectory(project.buildDir.resolve("classes/kotlin/main").absolutePath)
}
