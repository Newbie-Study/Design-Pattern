package tony.factory.example.abstractfactory

abstract class BurgerFactory {
    abstract fun createPatty(): String
}

class McDonaldFactory : BurgerFactory() {
    override fun createPatty(): String {
        return "소고기 패티"
    }
}

class MomsTouchFactory : BurgerFactory() {
    override fun createPatty(): String {
        return "닭고기 패티"
    }
}