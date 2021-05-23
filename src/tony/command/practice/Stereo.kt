package tony.command.practice

class Stereo(val name: String) {
    fun on() {
    }

    fun off() {
    }

    fun setCd() {
    }

    fun setDvd() {
    }

    fun setRadio() {
    }

    fun setVolume() {
    }
}

class StereoOnWithCDCommand(private val stereo: Stereo) : Command {
    override fun execute() {
        stereo.on()
        stereo.setCd()
        stereo.setVolume()
    }

    override fun undo() {
    }
}

class StereoOffWithCDCommand(private val stereo: Stereo) : Command {
    override fun execute() {
        stereo.off()
    }

    override fun undo() {
    }
}