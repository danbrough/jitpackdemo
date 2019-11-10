
plugins {
    id("digital.wup.android-maven-publish") version Versions.digital_wup_android_maven_publish_gradle_plugin

    id("com.android.library")
    kotlin("android")
    kotlin("kapt")
    kotlin("android.extensions")
}


//group = "com.github.danbrough.jitpackdemo"

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
            isMinifyEnabled = false
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


}


val sourcesJar by tasks.registering(Jar::class) {
    archiveClassifier.set("sources")
    from(android.sourceSets.getByName("main").java.srcDirs)
    //to("$buildDir/sources.jar")
}

publishing {

    publications {
        // Publish the release aar artifact
        register("mavenAar", MavenPublication::class) {
            //  from(components["android"])
            groupId = "danbroid"
            artifactId = "lib1"
            version = ProjectVersions.VERSION_NAME
            from(components["android"])

            //artifact("$buildDir/outputs/aar/mylibrary-debug.aar")
            //artifact(sourcesJar.get())
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


