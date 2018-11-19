import kotlin.String

/**
 * Find which updates are available by running
 *     `$ ./gradlew syncLibs`
 * This will only update the comments.
 *
 * YOU are responsible for updating manually the dependency version. */
object Versions {
    const val ktlint: String = "0.29.0" 
            /* Cannot resolve external dependency com.github.shyiko:ktlint:+ because no repositories are defined. 
            .... */

    const val com_gradle_build_scan_gradle_plugin: String = "1.16" //available: "2.0.2" 

    const val io_ktor: String = "1.0.0-rc" // exceed the version found: 0.9.5

    const val jmfayard_github_io_gradle_kotlin_dsl_libs_gradle_plugin: String = "0.2.6" 

    const val org_jetbrains_kotlin_jvm_gradle_plugin: String = "1.3.10" 

    const val org_jetbrains_kotlin: String = "1.3.10" 

    const val kotlinx_html_js: String = "0.6.10" //available: "0.6.11" 

    const val org_jlleitschuh_gradle_ktlint_idea_gradle_plugin: String =
            "6.2.1" //available: "6.3.0" 

    const val slf4j_log4j12: String = "1.7.25" 

    /**
     *
     *   To update Gradle, edit the wrapper file at path:
     *      ./gradle/wrapper/gradle-wrapper.properties
     */
    object Gradle {
        const val runningVersion: String = "4.10.2"

        const val currentVersion: String = "4.10.2"

        const val nightlyVersion: String = "5.1-20181119000035+0000"

        const val releaseCandidate: String = "5.0-rc-3"
    }
}
