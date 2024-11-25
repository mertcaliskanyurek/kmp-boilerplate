package $packageName.articles.presentation

import $packageName.articles.application.Article

data class ArticlesState (
    val articles: List<Article> = listOf(),
    val loading: Boolean = false,
    val error: String? = null
)
