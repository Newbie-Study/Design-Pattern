package jayden.decorator.sample.decorator

import jayden.decorator.sample.board.Board

class ConditionalBoard(
    private val board: Board
) : BoardDecorator() {

    override fun expand() {
        if (board.visibleCount + 5 <= board.articles.size) {
            board.expand()
        } else {
            println("더 이상 펼칠 수 없습니다!")
        }
    }

    override fun collapse() {
        if (board.articles.isNotEmpty() && board.visibleCount - 5 > 0) {
            board.collapse()
        } else {
            println("더 이상 접을 수 없습니다!")
        }
    }
}