package tony.command.practice

class Light(val name: String) {
    fun on() {
    }

    fun off() {
    }
}

class LightOnCommand(private val light: Light) : Command {
    override fun execute() {
        light.on()
    }

    override fun undo() {
        light.off()
    }
}

class LightOffCommand(private val light: Light) : Command {
    override fun execute() {
        light.off()
    }

    override fun undo() {
        light.on()
    }
}