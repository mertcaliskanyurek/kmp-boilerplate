package $packageName.articles.di

import $packageName.articles.data.ArticlesDataSource
import $packageName.articles.data.ArticlesRepository
import $packageName.articles.data.ArticlesService
import $packageName.articles.application.ArticlesUseCase
import $packageName.articles.presentation.ArticlesViewModel
import org.koin.dsl.module

val articlesModule = module {

    single<ArticlesService> { ArticlesService(get()) }
    single<ArticlesUseCase> { ArticlesUseCase(get()) }
    single<ArticlesViewModel> { ArticlesViewModel(get()) }
    single<ArticlesDataSource> { ArticlesDataSource(get()) }
    single<ArticlesRepository> { ArticlesRepository(get(), get()) }
}