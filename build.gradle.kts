plugins {
    kotlin("jvm") apply false
    id("io.spring.dependency-management")  apply false
}

allprojects {
    group = "ru.md"
    version = "1.0.0"
    repositories {
        mavenCentral()
    }
}

subprojects {
    group = rootProject.group
    version = rootProject.version

    apply {
        plugin("io.spring.dependency-management")
    }
}

//kotlin {
//    jvmToolchain(11)
//}