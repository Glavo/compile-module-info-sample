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
