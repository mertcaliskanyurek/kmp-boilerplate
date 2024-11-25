package $packageName.di

import $packageName.articles.di.articlesModule
import $packageName.sources.di.sourcesModule

val sharedKoinModules = listOf(
    articlesModule,
    sourcesModule,
    networkModule,
)