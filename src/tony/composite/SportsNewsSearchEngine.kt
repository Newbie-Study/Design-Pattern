package tony.composite

class SportsNewsSearchEngine : SearchEngine() {
    private val contents = hashMapOf<String, String>()

    override fun search(keyword: String): Boolean {
        if (contents[keyword] != null) {
            println(contents[keyword])
            return true
        }
        return false
    }

    fun addContents(keyword: String, content: String) {
        contents[keyword] = content
    }
}