plugins {
  id("com.android.library")
  kotlin("android")
  kotlin("android.extensions")
  id("maven-publish") //need this for jitpack.io and local maven publishing
}

android {
  compileSdkVersion(Constants.SDK_VERSION)
  defaultConfig {
    minSdkVersion(Constants.MIN_SDK)
    targetSdkVersion(Constants.TARGET_SDK)
    versionCode = 1
    versionName = "1.0"
    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    consumerProguardFiles("consumer-rules.pro")

  }

  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
  }

  buildTypes {
    getByName("release") {
      isMinifyEnabled = false // IMPORTANT BIT else you release aar will have no classes
      proguardFiles(
        getDefaultProguardFile("proguard-android-optimize.txt"),
        "proguard-rules.pro"
      )
    }
  }


}

val sourcesJar by tasks.registering(Jar::class) {
  archiveClassifier.set("sources")
  from(android.sourceSets.getByName("main").java.srcDirs)
}

afterEvaluate {
  publishing {
    publications {
      val release by publications.registering(MavenPublication::class) {
        from(components["release"])
        artifact(sourcesJar.get())
        artifactId = "lib1"
        groupId = "com.github.danbrough.jitpackdemo"
        version = "1.0.2"  //github release of com.github.danbrough.jitpackdemo
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
  implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Constants.kotlin_version}")
}


