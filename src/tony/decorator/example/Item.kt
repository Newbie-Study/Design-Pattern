package tony.decorator.example

abstract class Item {
    open val attack = 0
    open val defense = 0
    open val name = "아이템"

    fun describe(){
        println("************************")
        println("$name\n공격력: $attack\n방어력: $defense")
        println("************************")
    }
}