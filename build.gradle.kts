import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {

    dependencies {
        classpath(Libs.com_android_tools_build_gradle)
        classpath(Libs.kotlin_gradle_plugin)
        classpath(Libs.navigation_safe_args_gradle_plugin)

        // Libs.android_maven_gradle_plugin is "com.github.dcendents:android-maven-gradle-plugin:2.1"
        classpath(Libs.android_maven_gradle_plugin) //IMPORTANT BIT

    }

    repositories {
        google()
        jcenter()
    }
}


plugins {
    buildSrcVersions
}

allprojects {
    repositories {
        google()
        jcenter()
       // mavenLocal()
        maven {
            setUrl("https://jitpack.io") //IMPORTANT BIT
        }
    }
    tasks.withType<KotlinCompile> {
        kotlinOptions {
            jvmTarget = "1.8"
            //freeCompilerArgs = listOf("-Xjsr305=strict")
            //freeCompilerArgs = listOf("-Xuse-experimental=kotlin.Experimental")
            //freeCompilerArgs = listOf("-Xuse-experimental=kotlinx.coroutines.ExperimentalCoroutinesApi")
        }
    }

}

