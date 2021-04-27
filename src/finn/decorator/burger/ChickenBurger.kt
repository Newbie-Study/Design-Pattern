package finn.decorator.burger

class ChickenBurger : Burger() {

    override val name: String
        get() = "치킨 버거"

    override val cost: Int
        get() = 5000
}