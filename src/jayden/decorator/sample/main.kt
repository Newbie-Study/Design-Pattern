package jayden.decorator.sample

import jayden.decorator.sample.board.ITBoard
import jayden.decorator.sample.decorator.ConditionalBoard

fun main() {
    val itBoard = ITBoard(
        title = "IT 뉴스",
        contents = "IT 뉴스 관련 기사"
    )
    itBoard.articles = listOf(
        "리튬전지 화재 줄일 실마리 찾아",
        "웨일 브라우저 과연 국내 1위를 달성할 수 있을까?",
        "애플 iOS 업데이트, 개인정보 추적 선택권 제공",
        "KT, TV 채팅 서비스 시작",
        "알파카의 나노바디",
    )
    itBoard.expand()
    // itBoard.expand()  // IndexOutOfBoundsException 발생

    val expandableBoard = ConditionalBoard(itBoard)

    expandableBoard.expand()
    expandableBoard.expand()
}