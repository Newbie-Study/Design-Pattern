package jayden.decorator.sample.board

abstract class Board {
    open val title: String = ""
    open val contents: String = ""

    open var articles: List<String> = emptyList()
    open var visibleArticles: List<String> = emptyList()

    open var visibleCount = 0

    abstract fun expand()

    abstract fun collapse()
}