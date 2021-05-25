package tony.command.practice

interface Command {
    fun execute()
    fun undo()
}

class NoCommand: Command {
    override fun execute() {
    }

    override fun undo() {
    }
}