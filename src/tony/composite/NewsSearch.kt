package tony.composite

class NewsSearch : SearchEngine() {
    private val searchEngines = mutableListOf<SearchEngine>()

    override fun search(keyword: String): Boolean {
        for (engine in searchEngines) {
            if (engine.search(keyword)) {
                return true
            }
        }
        return false
    }

    fun addSearchEngines(engine: SearchEngine) {
        searchEngines.add(engine)
    }
}