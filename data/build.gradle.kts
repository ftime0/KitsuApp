plugins {
    id("com.android.library")
    kotlin("android")
    // Kapt
    id("kotlin-kapt")
}
android {
    compileSdk = 32

    defaultConfig {
        minSdk = 23
        targetSdk = 32

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
            buildConfigField("String", "BASE_URL", "\"https://kitsu.io/api/edge/\"")
            buildConfigField("String", "AU_BASE_URL", "\"https://kitsu.io/api/oauth\"")

        }
        debug{
            buildConfigField("String", "BASE_URL", "\"https://kitsu.io/api/edge/\"")
            buildConfigField("String", "AU_BASE_URL", "\"https://kitsu.io/api/oauth\"")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    // Retrofit
    implementation(libs.retrofit)
    implementation(libs.retrofit.gsonConverter)

    // OkHttpClient
    implementation(libs.okHttp)
    implementation(libs.okHttp.interceptor)

    // Room
    implementation(libs.bundles.roomBundle)
    kapt(libs.room.compiler)
    implementation(project(":domain"))

    // Paging 3
    api(libs.paging.paging)
}