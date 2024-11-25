package $packageName.articles.data

import $packageName.db.$appNameDatabase

class ArticlesDataSource(private val database: $appNameDatabase) {

    fun getAllArticles(): List<ArticleRaw> =
        database.$camelCaseAppNameDatabaseQueries.selectAllArticles(::mapToArticleRaw).executeAsList()

    fun insertArticles(articles: List<ArticleRaw>) {
        database.$camelCaseAppNameDatabaseQueries.transaction {
            articles.forEach { articleRaw ->
                insertArticle(articleRaw)
            }
        }
    }

    fun clearArticles() =
        database.$camelCaseAppNameDatabaseQueries.removeAllArticles()

    private fun insertArticle(articleRaw: ArticleRaw) {
        database.$camelCaseAppNameDatabaseQueries.insertArticle(
            articleRaw.title,
            articleRaw.desc,
            articleRaw.date,
            articleRaw.imageUrl
        )
    }

    private fun mapToArticleRaw(
        title: String,
        desc: String?,
        date: String,
        url: String?
    ): ArticleRaw =
        ArticleRaw(
            title,
            desc,
            date,
            url
        )
}