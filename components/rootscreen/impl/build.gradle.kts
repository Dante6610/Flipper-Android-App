plugins {
    id("flipper.multiplatform-compose")
    id("flipper.anvil")
}

android.namespace = "com.flipperdevices.rootscreen.impl"


    kotlin {
        sourceSets {
            commonMain.dependencies {

            }
            androidMain.dependencies {
                dependencies {
    implementation(projects.components.rootscreen.api)

    implementation(projects.components.core.di)
    implementation(projects.components.core.log)
    implementation(projects.components.core.ui.theme)
    implementation(projects.components.core.ui.decompose)

    implementation(projects.components.deeplink.api)

    implementation(projects.components.firstpair.api)
    implementation(projects.components.bottombar.api)
    implementation(projects.components.updater.api)
    implementation(projects.components.screenstreaming.api)
    implementation(projects.components.widget.api)
    implementation(projects.components.share.api)
    implementation(projects.components.keyscreen.api)
    implementation(projects.components.bridge.dao.api)

    // Compose
    implementation(libs.compose.ui)
    implementation(libs.compose.tooling)
    implementation(libs.compose.foundation)
    implementation(libs.compose.material)
    implementation(libs.bundles.decompose)
    implementation(libs.bundles.essenty)
}
            }
        }
    }
