package jayden.decorator.practice.condiment

import jayden.decorator.practice.beverage.Beverage

class Soy(beverage: Beverage) : CondimentDecorator() {
    override val description: String = "${beverage.description}, 두유"

    override val cost: Double = when (beverage.size) {
        Size.TALL -> .15
        Size.GRANDE -> .20
        Size.VENTI -> .30
    } + beverage.cost
}