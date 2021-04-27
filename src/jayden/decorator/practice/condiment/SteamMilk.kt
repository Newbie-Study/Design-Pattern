package jayden.decorator.practice.condiment

import jayden.decorator.practice.beverage.Beverage

class SteamMilk(beverage: Beverage) : CondimentDecorator() {
    override val description: String = "${beverage.description}, 스팀 밀크"

    override val cost: Double = when (beverage.size) {
        Size.TALL -> .10
        Size.GRANDE -> .15
        Size.VENTI -> .20
    } + beverage.cost
}