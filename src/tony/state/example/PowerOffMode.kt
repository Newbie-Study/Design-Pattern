package tony.state.example

class PowerOffMode(private val phone: SmartPhone) : State {
    override fun playOdin() {
        println("zZZ")
    }

    override fun useKakaoMap() {
        println("zZZ")
    }

    override fun call() {
        println("zZZ")
    }

    override fun useKakaoTalk() {
        println("zZZ")
    }
}