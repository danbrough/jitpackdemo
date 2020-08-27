buildscript {

  dependencies {
    classpath("com.android.tools.build:gradle:4.1.0-rc01")
    classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.0")
  }

  repositories {
    google()
    jcenter()
  }
}


allprojects {
  repositories {
    mavenLocal()
    google()
    jcenter()
    maven {
      setUrl("https://jitpack.io") //IMPORTANT BIT
    }
    //maven { setUrl("https://dl.bintray.com/kotlin/kotlin-eap") }

  }
}

