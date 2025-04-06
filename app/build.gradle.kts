plugins {
    // alias(libs.plugins.android.application)
    id("com.android.application")
    id("com.google.gms.google-services")
    // alias(libs.plugins.google.gms.google.services)
}

android {
    namespace = "com.megha.bookapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.megha.bookapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures{
        viewBinding = true
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)

    implementation(platform(libs.firebase.bom)) // Use BOM defined in libs.versions.toml
    implementation("com.google.firebase:firebase-analytics") // Keep analytics explicit if needed

    implementation(libs.firebase.auth) // Version managed by BOM
    implementation(libs.firebase.database) // Version managed by BOM
    implementation(libs.firebase.storage) // Version managed by BOM

    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}