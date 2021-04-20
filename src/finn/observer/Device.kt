package finn.observer

interface Device {
    fun showTalk(talk: String)
}

class Galaxy : Device {
    override fun showTalk(talk: String) {
        println("Galaxy $talk")
    }
}

class IPhone : Device {
    override fun showTalk(talk: String) {
        println("IPhone $talk")
    }
}

class MacBook : Device {
    override fun showTalk(talk: String) {
        println("MacBook $talk")
    }
}