plugins {
  id("com.android.application")
  kotlin("android")
  kotlin("kapt")
  kotlin("android.extensions")
}

android {
  compileSdkVersion(Constants.SDK_VERSION)

  defaultConfig {

    minSdkVersion(Constants.MIN_SDK)
    targetSdkVersion(Constants.TARGET_SDK)
    versionCode = 1
    versionName = "1.0"
    multiDexEnabled = true
    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
  }


  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
  }
}


dependencies {


  implementation("com.github.danbrough.jitpackdemo:lib1:1.0.2") //1.0.2 is the tag on github
  implementation("com.github.danbrough.jitpackdemo:lib2:1.0.2")

  implementation("androidx.constraintlayout:constraintlayout:2.0.1")
  implementation("com.google.android.material:material:1.2.0")


}
