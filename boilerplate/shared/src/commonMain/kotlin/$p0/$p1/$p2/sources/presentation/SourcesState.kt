package $packageName.sources.presentation

import $packageName.sources.application.Source

data class SourcesState (
    val sources: List<Source>,
    val loading: Boolean = false,
    val error: String? = null
)
