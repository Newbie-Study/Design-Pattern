package finn.decorator.decorator

import finn.decorator.burger.Burger

class Lettuce(override val burger: Burger) : MaterialDecorator() {

    override val name: String
        get() = burger.name + " + 양상추 추가"

    override val cost: Int
        get() = burger.cost + 500
}