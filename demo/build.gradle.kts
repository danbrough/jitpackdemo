plugins {
  id("com.android.application")
  kotlin("android")
  kotlin("kapt")
  kotlin("android.extensions")
  id("androidx.navigation.safeargs.kotlin")
}

android {
  compileSdkVersion(ProjectVersions.SDK_VERSION)

  defaultConfig {

    minSdkVersion(ProjectVersions.MIN_SDK_VERSION)
    targetSdkVersion(ProjectVersions.SDK_VERSION)
    versionCode = ProjectVersions.VERSION_CODE
    versionName = ProjectVersions.VERSION_NAME
    multiDexEnabled = true
    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
  }


  compileOptions {
    sourceCompatibility = ProjectVersions.JAVA_VERSION
    targetCompatibility = ProjectVersions.JAVA_VERSION
  }

  dataBinding {
    isEnabled = false
  }

  androidExtensions {
    isExperimental = true
  }
}


dependencies {


  implementation(project(":lib1"))
  implementation(project(":lib2"))
  //implementation("com.github.danbrough.jitpackdemo:lib1:1.0.0")
  //implementation("com.github.danbrough.jitpackdemo:lib2:1.0.0")



  implementation(Libs.slf4j_api)
  implementation(Libs.constraintlayout)
  implementation(Libs.material)


}
