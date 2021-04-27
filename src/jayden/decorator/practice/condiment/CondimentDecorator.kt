package jayden.decorator.practice.condiment

import jayden.decorator.practice.beverage.Beverage

abstract class CondimentDecorator : Beverage() {
    abstract override val description: String
}