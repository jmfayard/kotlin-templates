object Config {

    val hello = "Hello World"

    val latestGradleVersion = Versions.Gradle.currentVersion

    val pluginsResolution : Map<String, String> = mapOf(
            "org.jetbrains.kotlin.jvm" to Libs.kotlin_gradle_plugin,
            "kotlin-android" to Libs.kotlin_gradle_plugin,
            "kotlin-dce-js" to Libs.kotlin_gradle_plugin,
            "kotlin2js" to Libs.kotlin_gradle_plugin
    )
}