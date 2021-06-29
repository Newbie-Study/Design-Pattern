package tony.state.example

class SmartPhone(private val model: String, battery: Int) {
    var normalMode = NormalMode(this)
    var powerSaveMode = PowerSaveMode(this)
    var powerOffMode = PowerOffMode(this)

    var state: State = normalMode

    var battery: Int = battery
        private set

    init {
        if (battery == 0) {
            state = powerOffMode
        } else if (battery < 30) {
            state = powerSaveMode
        }
    }

    fun playOdin() {
        println("====[$model] 오딘을 실행합니다====")
        battery = if (battery - 50 <= 0) 0 else battery - 30
        state.playOdin()
    }

    fun useKakaoMap() {
        println("====[$model] 카카오맵을 실행합니다====")
        battery = if (battery - 20 <= 0) 0 else battery - 20
        state.useKakaoMap()
    }

    fun call(name: String) {
        println("====[$model] ${name}에게 전화를 겁니다====")
        battery = if (battery - 5 <= 0) 0 else battery - 5
        state.call()
    }

    fun useKakaoTalk() {
        println("====[$model] 카카오톡을 실행합니다====")
        battery = if (battery - 10 <= 0) 0 else battery - 10
        state.useKakaoTalk()
    }

    fun chargePhone() {
        println("====[$model] 휴대폰을 충전합니다====\n현재 배터리: $battery")
        if(battery == 0) {
            println("휴대폰이 켜졌습니다")
        }else if(battery < 30) {
            println("절전 모드를 종료합니다")
        }
        battery = 100
        state = normalMode
        println("====[$model] 배터리가 ${battery}%가 되었습니다====")
    }

    fun checkBattery() {
        if (battery == 0) {
            println("[$model] 배터리가 부족해서 전원을 종료합니다")
            state = powerOffMode
        } else if (battery < 30) {
            println("[$model] 절전 모드로 전환합니다")
            state = powerSaveMode
        }
    }
}