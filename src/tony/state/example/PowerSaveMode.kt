package tony.state.example

class PowerSaveMode(private val phone: SmartPhone) : State {
    override fun playOdin() {
        println("절전 모드에서는 오딘을 실행할 수 없습니다")
        phone.checkBattery()
    }

    override fun useKakaoMap() {
        println("절전 모드에서는 카카오맵을 실행할 수 없습니다")
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