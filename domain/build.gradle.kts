plugins {
    kotlin("jvm")
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

dependencies {
    //Core
    api(libs.javax.inject)
    //Inject
    api(libs.coroutines.core)
}