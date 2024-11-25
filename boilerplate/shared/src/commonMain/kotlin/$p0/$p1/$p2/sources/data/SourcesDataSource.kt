package $packageName.sources.data

import $packageName.db.$appNameDatabase

class SourcesDataSource(private val db: $appNameDatabase) {

    fun getAllSources(): List<SourceRaw> =
        db.$camelCaseAppNameDatabaseQueries.selectAllSources(::mapSource).executeAsList()

    fun clearSources() =
        db.$camelCaseAppNameDatabaseQueries.removeAllSources()

    private fun mapSource(
        id: String,
        name: String,
        desc: String,
        language: String,
        country: String
    ): SourceRaw {
        return SourceRaw(
            id,
            name,
            desc,
            language,
            country
        )
    }

    internal fun createSources(sources: List<SourceRaw>) {
        db.$camelCaseAppNameDatabaseQueries.transaction {
            sources.forEach { source ->
                insertSource(source)
            }
        }
    }

    private fun insertSource(source: SourceRaw) {
        db.$camelCaseAppNameDatabaseQueries.insertSource(
            source.id,
            source.name,
            source.desc,
            source.language,
            source.country,
        )
    }
}
