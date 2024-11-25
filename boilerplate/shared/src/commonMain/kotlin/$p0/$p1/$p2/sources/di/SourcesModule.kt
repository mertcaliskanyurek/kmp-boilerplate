package $packageName.sources.di

import org.koin.dsl.module
import $packageName.sources.data.SourcesDataSource
import $packageName.sources.data.SourcesRepository
import $packageName.sources.data.SourcesService
import $packageName.sources.application.SourcesUseCase
import $packageName.sources.presentation.SourcesViewModel

val sourcesModule = module {

    single<SourcesService> { SourcesService(get()) }
    single<SourcesUseCase> { SourcesUseCase(get()) }
    single<SourcesDataSource> { SourcesDataSource(get()) }
    single<SourcesRepository> { SourcesRepository(get(), get()) }
    single<SourcesViewModel> { SourcesViewModel(get()) }
}
