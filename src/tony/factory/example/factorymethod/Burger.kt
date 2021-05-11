package tony.factory.example.factorymethod

abstract class Burger {
    var name: String? = null
    var patty: String? = null
    var price: Int? = null

    fun info() {
        println("$name($patty 패티): ${price}원")
    }
}

class BigMac : Burger() {
    init {
        name = "빅맥"
        patty = "소고기"
        price = 4500
    }
}

class DoubleQuarterPounderWithCheese : Burger() {
    init {
        name = "더블 쿼터 파운더 치즈 버거"
        patty = "소고기"
        price = 6900
    }
}

class Thigh : Burger() {
    init {
        name = "싸이 버거"
        patty = "닭고기"
        price = 3900
    }
}

class WhiteGarlic : Burger() {
    init {
        name = "화이트 갈릭 버거"
        patty = "닭고기"
        price = 3900
    }
}