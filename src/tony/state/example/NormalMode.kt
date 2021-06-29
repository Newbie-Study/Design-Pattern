package tony.state.example

class NormalMode(private val phone: SmartPhone) : State {
    override fun playOdin() {
        println("오딘을 플레이합니다")
        phone.checkBattery()
    }

    override fun useKakaoMap() {
        println("GPS를 사용합니다")
        phone.checkBattery()
    }

    override fun call() {
        println("통화를 합니다")
        phone.checkBattery()
    }

    override fun useKakaoTalk() {
        println("채팅을 합니다")
        phone.checkBattery()
    }
}