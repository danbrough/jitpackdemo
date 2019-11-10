# jitpackdemo
Demo of a multi-module android project with maven publishing and kotlin-dsl

This project consists of 3 gradle modules "demo" (an android app) "lib1" and "lib2" which are android library modules.

`./gradlew publishToMavenLocal` will publish to your local maven repository, or if the code is on github then its published automatically
via https://jitpack.io

