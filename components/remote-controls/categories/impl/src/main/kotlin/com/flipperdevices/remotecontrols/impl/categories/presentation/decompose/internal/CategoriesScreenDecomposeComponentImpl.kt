package com.flipperdevices.remotecontrols.impl.categories.presentation.decompose.internal

import androidx.compose.runtime.Composable
import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.childContext
import com.flipperdevices.core.di.AppGraph
import com.flipperdevices.faphub.errors.api.FapHubComposableErrorsRenderer
import com.flipperdevices.remotecontrols.api.CategoriesScreenDecomposeComponent
import com.flipperdevices.remotecontrols.api.PauseSyncDialogDecomposeComponent
import com.flipperdevices.remotecontrols.impl.categories.composable.DeviceCategoriesScreen
import com.flipperdevices.remotecontrols.impl.categories.presentation.decompose.DeviceCategoriesComponent
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject
import me.gulya.anvil.assisted.ContributesAssistedFactory

@ContributesAssistedFactory(AppGraph::class, CategoriesScreenDecomposeComponent.Factory::class)
class CategoriesScreenDecomposeComponentImpl @AssistedInject constructor(
    @Assisted componentContext: ComponentContext,
    @Assisted onBackClick: () -> Unit,
    @Assisted onCategoryClick: (categoryId: Long, categoryName: String) -> Unit,
    deviceCategoriesComponentFactory: DeviceCategoriesComponent.Factory,
    private val errorsRenderer: FapHubComposableErrorsRenderer,
    private val pauseSyncDialogComponentFactory: PauseSyncDialogDecomposeComponent.Factory
) : CategoriesScreenDecomposeComponent(componentContext) {
    private val deviceCategoriesComponent = deviceCategoriesComponentFactory.invoke(
        componentContext = childContext("DeviceCategoriesComponent"),
        onBackClick = onBackClick,
        onCategoryClick = onCategoryClick
    )
    private val pauseSyncDialogComponent = pauseSyncDialogComponentFactory.invoke(
        componentContext = childContext("PauseSyncDialogDecomposeComponent_CategoriesScreenDecomposeComponent"),
        onProceed = {},
        onBack = onBackClick
    )

    @Composable
    override fun Render() {
        DeviceCategoriesScreen(
            deviceCategoriesComponent = deviceCategoriesComponent,
            errorsRenderer = errorsRenderer
        )
        pauseSyncDialogComponent.Render()
    }
}
