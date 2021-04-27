package jayden.decorator.practice.condiment

import jayden.decorator.practice.beverage.Beverage
import jayden.decorator.practice.beverage.Beverage.Size.*

class Mocha(beverage: Beverage) : CondimentDecorator() {
    override val description: String = "${beverage.description}, 모카"

    override val cost: Double = when (beverage.size) {
        TALL -> .20
        GRANDE -> .25
        VENTI -> .30
    } + beverage.cost
}