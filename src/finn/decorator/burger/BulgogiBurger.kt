package finn.decorator.burger

class BulgogiBurger : Burger() {

    override val name: String
        get() = "불고기 버거"

    override val cost: Int
        get() = 3500
}