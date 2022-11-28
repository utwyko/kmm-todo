buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.22")
        classpath("com.android.tools.build:gradle:7.0.0-alpha15")
    }
}

plugins {
    id("com.github.ben-manes.versions") version("0.38.0")
}

group = "nl.wykorijnsburger"
version = "1.0-SNAPSHOT"

allprojects {
    repositories {
        google()
        mavenCentral()
        jcenter()
        maven("https://kotlin.bintray.com/kotlinx")
    }
}

tasks.withType<Wrapper> {
    distributionType = Wrapper.DistributionType.ALL
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}
