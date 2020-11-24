import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.10"
}
group = "me.filipe"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    flatDir{dirs("libs")}
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "13"
}

dependencies {
    implementation("pt.isel:CanvasLib-jvm:1.0.0")
}