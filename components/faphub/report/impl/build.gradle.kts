plugins {
    id("flipper.multiplatform-compose")
    id("flipper.anvil")
    id("kotlinx-serialization")
}

android.namespace = "com.flipperdevices.faphub.report.impl"


    kotlin {
        sourceSets {
            commonMain.dependencies {

            }
            androidMain.dependencies {
                dependencies {
    implementation(projects.components.faphub.report.api)

    implementation(projects.components.core.di)
    implementation(projects.components.core.log)
    implementation(projects.components.core.ui.decompose)
    implementation(projects.components.core.ui.ktx)
    implementation(projects.components.core.ui.theme)
    implementation(projects.components.core.ui.res)
    implementation(projects.components.core.ui.lifecycle)
    implementation(projects.components.core.markdown)

    implementation(projects.components.faphub.dao.api)
    implementation(projects.components.inappnotification.api)

    // Compose
    implementation(libs.compose.ui)
    implementation(libs.compose.tooling)
    implementation(libs.compose.foundation)
    implementation(libs.compose.material)
    implementation(libs.bundles.decompose)

    // ViewModel
    implementation(libs.lifecycle.compose)
    implementation(libs.lifecycle.viewmodel.ktx)
}
            }
        }
    }
