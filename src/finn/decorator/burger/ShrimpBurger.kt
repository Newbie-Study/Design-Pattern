package finn.decorator.burger

class ShrimpBurger : Burger() {

    override val name: String
        get() = "새우 버거"

    override val cost: Int
        get() = 4000
}