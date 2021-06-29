package finn.state

interface Mode {
    fun drive()
}

class DriveMode : Mode {
    override fun drive() {
        println("drive mode")
    }
}

class ComportMode : Mode {
    override fun drive() {
        println("comport mode")
    }
}

class EchoMode : Mode {
    override fun drive() {
        println("echo mode")
    }
}

class Car {

    private var mode: Mode = ComportMode() // Default = Comport

    fun setMode(mode: Mode) {
        this.mode = mode
    }

    fun drive() {
        mode.drive()
    }
}
