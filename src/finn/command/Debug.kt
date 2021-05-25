package finn.command

class DebugCommand(private val debugger: Debugger) : Command {
    override fun execute() {
        debugger.show()
    }
}

class Debugger(val name: String) {
    fun show() = println("디비거 : $name")
}