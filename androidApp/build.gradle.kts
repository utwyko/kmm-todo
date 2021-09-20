plugins {
    id("com.android.application")
    kotlin("android")
}

group = "nl.wykorijnsburger"
version = "1.0-SNAPSHOT"

val composeVersion = "1.0.0-rc02"
val viewModelComposeVersion = "1.0.0-alpha05"
val activityVersion = "1.4.0-alpha02"
val appCompatVersion = "1.3.0-rc01"
val coreKtxVersion = "1.6.0-beta01"

dependencies {
    implementation(project(":shared"))

    implementation("androidx.compose.ui:ui:$composeVersion")
    implementation("androidx.activity:activity-compose:$activityVersion")
//    // Tooling support (Previews, etc.)
    implementation("androidx.compose.ui:ui-tooling:$composeVersion")
//    // Foundation (Border, Background, Box, Image, Scroll, shapes, animations, etc.)
    implementation("androidx.compose.foundation:foundation:$composeVersion")
//    // Material Design
    implementation("androidx.compose.material:material:$composeVersion")
    implementation("androidx.compose.material:material-icons-extended:$composeVersion")


    implementation("androidx.compose.runtime:runtime-livedata:$composeVersion")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:$viewModelComposeVersion")

    implementation("androidx.appcompat:appcompat:$appCompatVersion")

    implementation("androidx.core:core-ktx:$coreKtxVersion")
//    // Material design icons
//    implementation 'androidx.compose.material:material-icons-core:1.0.0-beta01'
//    implementation 'androidx.compose.material:material-icons-extended:1.0.0-beta01'
//    // Integration with activities
//    implementation 'androidx.activity:activity-compose:1.3.0-alpha03'
//    // Integration with ViewModels
//    implementation 'androidx.lifecycle:lifecycle-viewmodel-compose:1.0.0-alpha02'
//    // Integration with observables
//    implementation 'androidx.compose.runtime:runtime-livedata:1.0.0-beta01'
//    implementation 'androidx.compose.runtime:runtime-rxjava2:1.0.0-beta01'
}

android {
    compileSdkVersion(30)
    defaultConfig {
        applicationId = "nl.wykorijnsburger.androidApp"
        minSdkVersion(21)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "1.0"
    }

    buildFeatures {
        // Enables Jetpack Compose for this module
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = composeVersion
    }

    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions {
            jvmTarget = "1.8"
        }
    }
}
