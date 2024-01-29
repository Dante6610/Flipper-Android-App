plugins {
    id("flipper.multiplatform")
}

android.namespace = "com.flipperdevices.debug.api"


    kotlin {
        sourceSets {
            commonMain.dependencies {

            }
            androidMain.dependencies {
                dependencies {
    implementation(projects.components.core.ui.decompose)
    implementation(libs.decompose)
}
            }
        }
    }
