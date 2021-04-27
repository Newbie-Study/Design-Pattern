package jayden.decorator.practice.condiment

import jayden.decorator.practice.beverage.Beverage

class Whip(beverage: Beverage) : CondimentDecorator() {
    override val description: String = "${beverage.description}, 휘핑 크림"

    override val cost: Double = when (beverage.size) {
        Size.TALL -> .10
        Size.GRANDE -> .15
        Size.VENTI -> .20
    } + beverage.cost
}