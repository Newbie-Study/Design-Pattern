package jayden.decorator.practice

import jayden.decorator.practice.beverage.Beverage
import jayden.decorator.practice.beverage.DarkRoast
import jayden.decorator.practice.beverage.Espresso
import jayden.decorator.practice.beverage.HouseBlend
import jayden.decorator.practice.condiment.Mocha
import jayden.decorator.practice.condiment.Soy
import jayden.decorator.practice.condiment.Whip

fun main() {
    val espresso = Espresso(Beverage.Size.TALL)
    print(espresso)

    var darkRost: Beverage = DarkRoast(Beverage.Size.GRANDE)
    darkRost = Mocha(darkRost)
    darkRost = Mocha(darkRost)
    darkRost = Whip(darkRost)
    print(darkRost)

    var houseBlend: Beverage = HouseBlend(Beverage.Size.VENTI)
    houseBlend = Soy(houseBlend)
    houseBlend = Mocha(houseBlend)
    houseBlend = Whip(houseBlend)
    print(houseBlend)
}

private fun print(beverage: Beverage) {
    println("${beverage.description} $${beverage.cost}")
}