# jitpackdemo
Demo of a multi-module android project with maven publishing and kotlin-dsl

This project consists of 3 gradle modules "demo" (an android app) "lib1" and "lib2" which are android library modules.

`./gradlew publishToMavenLocal` will publish to your local maven repository which can then be accessed
from local projects by adding `mavenLocal()` to you gradle maven repositories, or if the code is on github 
then its built and published automatically via the (jitpack.io)[https://jitpack.io] maven repository.

Have a look at the 3 build.gradle.kts files.
lib1 and lib2 are pretty much identical and publish their libraries to maven.

The demo uses the builds from jitpack.io rather than the local projects.

The publishing configurations in [lib1/build.gradle.kts](lib1/build.gradle.kts) and [lib2/build.gradle.kts](lib2/build.gradle.kts) also include the source code jars as well.





 



