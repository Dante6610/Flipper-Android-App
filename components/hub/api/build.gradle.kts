plugins {
    id("flipper.multiplatform")
}

android.namespace = "com.flipperdevices.hub.api"


    kotlin {
        sourceSets {
            commonMain.dependencies {

            }
            androidMain.dependencies {
                dependencies {
    implementation(projects.components.core.ui.decompose)

    implementation(projects.components.deeplink.api)

    implementation(libs.decompose)

    implementation(libs.kotlin.coroutines)
}
            }
        }
    }
