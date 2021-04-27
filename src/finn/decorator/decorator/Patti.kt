package finn.decorator.decorator

import finn.decorator.burger.Burger

class Patti(override val burger: Burger) : MaterialDecorator() {

    override val name: String
        get() = burger.name + " + 패티 추가"

    override val cost: Int
        get() = burger.cost + 1000
}