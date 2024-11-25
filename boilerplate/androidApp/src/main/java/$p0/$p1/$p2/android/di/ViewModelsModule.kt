package $packageName.android.di

import $packageName.articles.presentation.ArticlesViewModel
import $packageName.sources.presentation.SourcesViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelsModule = module {

    viewModel { ArticlesViewModel(get()) }
    viewModel { SourcesViewModel(get()) }
}