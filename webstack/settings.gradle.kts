//pluginManagement {
//    repositories {
//        gradlePluginPortal()
//        mavenCentral()
//    }
//    resolutionStrategy {
//        eachPlugin {
//            val plugin = requested.id.id
//            val module = Config.pluginsResolution.get(plugin)
//            if (module != null) {
//                println("Using module $module for plugin=$plugin")
////                useModule(module)
//            } else {
//                println("Did not fix version for plugin $plugin")
//            }
//        }
//    }
//}

rootProject.name = "webstack"
include(":server", ":client")
