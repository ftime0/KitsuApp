plugins {
    // Application
    id("com.android.application")

    // Kotlin
    id("kotlin-android")

    // Kapt
    id("kotlin-kapt")

    // Navigation SafeArgs
    id("androidx.navigation.safeargs.kotlin")

    // Hilt
    id("com.google.dagger.hilt.android")

    id("kotlin-parcelize")
}

android {

    compileSdk = 32
    defaultConfig {
        applicationId ="com.example.kitsuapp"
        minSdk = 23
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    packagingOptions {
        resources.pickFirsts.add("META-INF/*")
        resources.excludes.add("META-INF/DEPENDENCIES")
        resources.excludes.add("META-INF/LICENSE")
        resources.excludes.add("META-INF/LICENSE.txt")
        resources.excludes.add("META-INF/license.txt")
        resources.excludes.add("META-INF/NOTICE")
        resources.excludes.add("META-INF/NOTICE.txt")
        resources.excludes.add("META-INF/notice.txt")
        resources.excludes.add("META-INF/ASL2.0")
        resources.excludes.add("META-INF/*")
    }
    //ViewBinding
    buildFeatures.viewBinding = true
}
dependencies {

    implementation(project(":data"))
    implementation(project(":domain"))

    // UI Components
    implementation(libs.bundles.uiComponents)

    // Core
    implementation(libs.android.core)

    //Coroutines
    implementation(libs.coroutines.android)

    // Lifecycle
    implementation(libs.bundles.lifecycleBundle)

    // Navigation
    implementation(libs.bundles.navigationBundle)


    // Hilt
    implementation(libs.hilt.hilt)
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    implementation("androidx.test:monitor:1.5.0")
    implementation("androidx.fragment:fragment:1.4.1")
    implementation("com.google.android.material:material:1.6.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.3")
    implementation("androidx.recyclerview:recyclerview:1.2.1")
    kapt(libs.hilt.compiler)
}