# Module Info Compiler Sample [![Gradle Build](https://github.com/Glavo/compile-module-info-sample/actions/workflows/build.yml/badge.svg)](https://github.com/Glavo/compile-module-info-sample/actions/workflows/build.yml)

Sample project using the [module-info-compiler](https://github.com/Glavo/module-info-compiler) Gradle plugin.

`build.gradle.kts`:

```kotlin
plugins {
    id("java")
    id("org.glavo.compile-module-info-plugin") version "2.0"
}

group = "org.glavo"

tasks.compileJava {
    options.release.set(8)
}

tasks.jar {
    manifest {
        attributes("Main-Class" to "org.glavo.mic.sample.Main")
    }
}

tasks.named<org.glavo.mic.tasks.CompileModuleInfo>("compileModuleInfo") {
    moduleMainClass = "org.glavo.mic.sample.Main"
}

```

