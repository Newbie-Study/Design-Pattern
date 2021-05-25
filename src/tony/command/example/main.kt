package tony.command.example

fun main() {
    val computer = Computer()
    computer.run {
        pressQ()
        pressW()
        pressE()
        pressR()
    }

    val lol = LeagueOfLegend(LeeSin()).also {
        computer.program = it
    }
    computer.run {
        pressR()
        pressQ()
    }

    lol.character = KaiSa()
    computer.run {
        pressQ()
        pressW()
    }
}