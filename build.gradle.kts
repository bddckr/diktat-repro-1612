plugins {
    `java-library`
    alias(libs.plugins.kotlinJvm)

    alias(libs.plugins.spotless)
}

spotless {
    kotlinGradle {
        target("**/*.gradle.kts")
        targetExclude("**/build/", "**/.*/")
        diktat(libs.plugins.diktat.get().version.toString())
    }
}
