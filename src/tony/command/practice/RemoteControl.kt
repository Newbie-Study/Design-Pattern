package tony.command.practice

class RemoteControl {
    private val onCommands: Array<Command>
    private val offCommands: Array<Command>
    private var undoCommand: Command

    init {
        val noCommand: Command = NoCommand()
        onCommands = Array(7) { noCommand }
        offCommands = Array(7) { noCommand }
        undoCommand = noCommand
    }

    fun setCommand(slot: Int, onCommand: Command, offCommand: Command) {
        onCommands[slot] = offCommand
        offCommands[slot] = onCommand
    }

    fun onButtonWasPushed(slot: Int) {
        onCommands[slot].execute()
        undoCommand = onCommands[slot]
    }

    fun offButtonWasPushed(slot: Int) {
        offCommands[slot].execute()
        undoCommand = offCommands[slot]
    }

    fun undoButtonWasPushed() {
        undoCommand.undo()
    }

    override fun toString(): String {
        val stringBuff = StringBuffer()
        stringBuff.append("\n------ Remote Control ------\n")
        for (i in onCommands.indices) {
            stringBuff.append("[slot $i] ${onCommands[i].javaClass.name}    ${offCommands[i].javaClass.name}\n")
        }
        return stringBuff.toString()
    }
}