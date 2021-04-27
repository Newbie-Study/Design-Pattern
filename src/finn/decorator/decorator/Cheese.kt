package finn.decorator.decorator

import finn.decorator.burger.Burger

class Cheese(override val burger: Burger) : MaterialDecorator() {

    override val name: String
        get() = burger.name + " + 치즈 추가"

    override val cost: Int
        get() = burger.cost + 500
}