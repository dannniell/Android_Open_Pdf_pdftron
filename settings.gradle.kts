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
        maven {
            url = uri("https://pdftron-maven.s3.amazonaws.com/release")
        }
        //jcenter()
    }
}

rootProject.name = "Testing Open Pdf"
include(":app")
 