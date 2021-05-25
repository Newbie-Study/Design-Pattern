package tony.command.example

// Invoker
class Computer {
    var program: Program = OperatingSystem()

    fun pressQ() {
        program.pressQ()
    }

    fun pressW() {
        program.pressW()
    }

    fun pressE() {
        program.pressE()
    }

    fun pressR() {
        program.pressR()
    }
}