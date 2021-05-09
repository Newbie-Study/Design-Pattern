package tony.factory.example.abstractfactory

abstract class Burger(private val factory: BurgerFactory) {
    var name: String? = null
    var patty: String = factory.createPatty()
    var price: Int? = null

    fun info() {
        println("$name($patty 패티): ${price}원")
    }
}

class BigMac(factory: BurgerFactory) : Burger(factory) {
    init {
        name = "빅맥"
        price = 4500
    }
}

class DoubleQuarterPounderWithCheese(factory: BurgerFactory) : Burger(factory) {
    init {
        name = "더블 쿼터 파운더 치즈 버거"
        price = 6900
    }
}

class Thigh(factory: BurgerFactory) : Burger(factory) {
    init {
        name = "싸이 버거"
        price = 3900
    }
}

class WhiteGarlic(factory: BurgerFactory) : Burger(factory) {
    init {
        name = "화이트 갈릭 버거"
        price = 3900
    }
}