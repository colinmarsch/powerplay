pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "powerplay"
include(":app")
include(":core:data")
include(":core:domain")
include(":core:models")
include(":core:ui")
include(":feature:teams")
include(":feature:players")
