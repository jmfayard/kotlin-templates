//buildscript {
//    repositories {
//        jcenter()
//    }
//    dependencies {
//        classpath(Libs.kotlin_gradle_plugin)
//    }
//}
plugins {
    id("com.gradle.build-scan") version "1.16"
    id("jmfayard.github.io.gradle-kotlin-dsl-libs") version "0.2.6"  // $ ./gradlew syncLibs
    id("org.jlleitschuh.gradle.ktlint-idea") version "6.2.1"
}



buildScan {
    setTermsOfServiceUrl("https://gradle.com/terms-of-service")
    setTermsOfServiceAgree("yes")
    publishAlways()
}


//configurations.all {
//    resolutionStrategy {
//        for (version in Config.forceDependencyVersions) {
//            force(version)
//        }
//    }
//}

subprojects {
    group = "org.example"
    version = "0.1-SNAPSHOT"

    repositories {
        jcenter()
        mavenCentral()
    }
}
