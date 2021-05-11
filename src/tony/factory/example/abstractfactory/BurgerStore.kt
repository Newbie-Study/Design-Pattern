package tony.factory.example.abstractfactory

import java.security.InvalidParameterException

abstract class BurgerStore {
    abstract fun orderBurger(name: String): Burger
}

class McDonald : BurgerStore() {
    override fun orderBurger(name: String): Burger {
        val factory: BurgerFactory = McDonaldFactory()

        return when (name) {
            "빅맥" -> BigMac(factory)
            "더블 쿼터 파운더 치즈 버거" -> DoubleQuarterPounderWithCheese(factory)
            else -> throw InvalidParameterException()
        }
    }
}

class MomsTouch : BurgerStore() {
    override fun orderBurger(name: String): Burger {
        val factory: BurgerFactory = MomsTouchFactory()

        return when (name) {
            "싸이버거" -> Thigh(factory)
            "화이트 갈릭 버거" -> WhiteGarlic(factory)
            else -> throw InvalidParameterException()
        }
    }
}