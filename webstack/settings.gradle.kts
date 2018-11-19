pluginManagement {
    repositories {
        gradlePluginPortal()
        jcenter()
    }
    resolutionStrategy {
        eachPlugin {
            val plugin = requested.id.id
            val module = Config.pluginsResolution.get(plugin)
            if (module != null) {
                useModule(module)
            }
        }
    }
}

rootProject.name = "webstack"
include(":server", ":client")
