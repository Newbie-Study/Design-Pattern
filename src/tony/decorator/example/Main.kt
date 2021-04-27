package tony.decorator.example

fun main() {
    var sword: Item = Sword()
    var shield: Item = Shield()
    sword.describe()
    shield.describe()

    sword = PowerUp(sword).apply {
        enhance()
        enhance()
    }

    shield = DefenseUp(shield).apply {
        enhance()
    }
    shield = DefenseUp(shield).apply {
        enhance()
    }

    sword = PowerUp(sword).apply {
        enhance()
    }
    sword = PowerUp(sword).apply {
        enhance()
        enhance()
        enhance()
    }

    sword.describe()
    shield.describe()
}