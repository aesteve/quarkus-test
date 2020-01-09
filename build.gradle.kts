plugins {
    // Apply the Kotlin JVM plugin to add support for Kotlin on the JVM.
    id("org.jetbrains.kotlin.jvm") version("1.3.50")
    id("io.quarkus") version "1.1.1.Final"
    idea
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(enforcedPlatform("io.quarkus:quarkus-bom:1.1.1.Final"))
    implementation("io.quarkus:quarkus-resteasy-jsonb")
    implementation("io.quarkus:quarkus-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
}

sourceSets {
    main {
        java {
            srcDir(project.projectDir.resolve("src/main/kotlin").absolutePath)
            outputDir = project.buildDir.resolve("classes/kotlin/main")
        }
    }
}
