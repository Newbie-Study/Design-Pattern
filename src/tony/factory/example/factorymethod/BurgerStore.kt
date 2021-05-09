package tony.factory.example.factorymethod

import java.security.InvalidParameterException


abstract class BurgerStore {
    abstract fun orderBurger(name: String): Burger
}

class McDonald : BurgerStore() {
    override fun orderBurger(name: String): Burger {
        return when (name) {
            "빅맥" -> BigMac()
            "더블 쿼터 파운더 치즈 버거" -> DoubleQuarterPounderWithCheese()
            else -> throw InvalidParameterException()
        }
    }
}

class MomsTouch : BurgerStore() {
    override fun orderBurger(name: String): Burger {
        return when (name) {
            "싸이버거" -> Thigh()
            "화이트 갈릭 버거" -> WhiteGarlic()
            else -> throw InvalidParameterException()
        }
    }
}