package jayden.decorator.sample.board

class ITBoard(
    override val title: String,
    override val contents: String
) : Board() {
    override var articles = emptyList<String>()
    override var visibleArticles = emptyList<String>()

    override fun expand() {
        visibleCount += 5
        visibleArticles = articles.subList(0, visibleCount)

        printVisibleArticles()
    }

    override fun collapse() {
        visibleCount -= 5
        visibleArticles = articles.subList(0, visibleCount)

        printVisibleArticles()
    }

    private fun printVisibleArticles() {
        println("[기사 목록]")
        visibleArticles.forEach { title ->
            println(title)
        }
    }
}