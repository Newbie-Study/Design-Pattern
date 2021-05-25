package tony.command.example

// Command
interface Program {
    fun pressQ()
    fun pressW()
    fun pressE()
    fun pressR()
}

class OperatingSystem : Program {
    override fun pressQ() {
        println("Press Q")
    }

    override fun pressW() {
        println("Press W")
    }

    override fun pressE() {
        println("Press E")
    }

    override fun pressR() {
        println("Press R")
    }
}

// ConcreteCommand
class LeagueOfLegend(var character: Character) : Program {
    override fun pressQ() {
        character.skill1()
    }

    override fun pressW() {
        character.skill2()
    }

    override fun pressE() {
        character.skill3()
    }

    override fun pressR() {
        character.ultimateSkill()
    }
}