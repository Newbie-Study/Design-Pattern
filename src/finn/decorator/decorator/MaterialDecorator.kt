package finn.decorator.decorator

import finn.decorator.burger.Burger

abstract class MaterialDecorator : Burger() {

    abstract val burger: Burger
}