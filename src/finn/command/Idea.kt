package finn.command

class Idea {
    var debugCommand: Command? = null
    var conventionCommand: Command? = null


    fun changeCommand(command: Command) {
        when (command) {
            is DebugCommand -> debugCommand = command
            is ConventionCommand -> conventionCommand = command
        }
    }

    fun changeDebugCommand(command: Command) {
        debugCommand = command
    }

    fun changeConventionCommand(command: Command) {
        conventionCommand = command
    }

    fun debug() {
        debugCommand?.execute()
    }

    fun refactoring() {
        conventionCommand?.execute()
    }
}