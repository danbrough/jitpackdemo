
plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("kapt")
    kotlin("android.extensions")
    `maven-publish`
}

group = "com.github.danbrough" // IMPORTANT BIT

android {
    compileSdkVersion(ProjectVersions.SDK_VERSION)
    defaultConfig {
        minSdkVersion(ProjectVersions.MIN_SDK_VERSION)
        targetSdkVersion(ProjectVersions.SDK_VERSION)
        versionCode = ProjectVersions.VERSION_CODE
        versionName = ProjectVersions.VERSION_NAME
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")

    }

    compileOptions {
        sourceCompatibility = ProjectVersions.JAVA_VERSION
        targetCompatibility = ProjectVersions.JAVA_VERSION
    }

    buildTypes {

        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }

    }

    testOptions {
        unitTests.isIncludeAndroidResources = true
        unitTests.isReturnDefaultValues = true
    }

    publishing {
        publications {
            create<MavenPublication>("maven") {
                groupId = "com.github.danbrough"
                artifactId = "jitpackdemo"
                version = "0.0.9"

                artifact("$buildDir/outputs/aar/lib1-debug.aar")

            }
        }
    }

}




tasks.withType<Test> {
    useJUnit()
    testLogging {
        events("standardOut", "started", "passed", "skipped", "failed")
        showStandardStreams = true
        /*  outputs.upToDateWhen {
            false
          }*/
    }
}

dependencies {

    api(Libs.slf4j_api)
    api(Libs.kotlin_stdlib_jdk8)


}


