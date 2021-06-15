package tony.composite

class NaverSearch : SearchEngine() {
    private val searchEngines = mutableListOf<SearchEngine>()

    override fun search(keyword: String): Boolean {
        for (engine in searchEngines) {
            if (engine.search(keyword)) {
                return true
            }
        }
        println("검색된 결과가 없습니다")
        return false
    }

    fun addSearchEngine(engine: SearchEngine) {
        searchEngines.add(engine)
    }
}