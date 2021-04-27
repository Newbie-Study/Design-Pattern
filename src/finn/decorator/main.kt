package finn.decorator

import finn.decorator.burger.Burger
import finn.decorator.burger.ChickenBurger
import finn.decorator.decorator.Cheese
import finn.decorator.decorator.Patti

fun main(){
    var burger: Burger = ChickenBurger()

    println("메뉴: ${burger.name}, 가격 : ${burger.cost}")

    burger = Cheese(burger)

    println("메뉴: ${burger.name}, 가격 : ${burger.cost}")

    burger = Patti(burger)

    println("메뉴: ${burger.name}, 가격 : ${burger.cost}")
}