package greentea.adapter

interface SimplePay {
    fun simplePay()
    fun loadPlatformAccount()
}

class KakaoPay : SimplePay {
    override fun simplePay() {
        println("카카오 페이로 결제합니다.")
    }

    override fun loadPlatformAccount() {
        println("카카오 계정과 연동합니다.")
    }
}

class NaverPay : SimplePay {
    override fun simplePay() {
        println("네이버 페이로 결제합니다.")
    }

    override fun loadPlatformAccount() {
        println("네이버 계정과 연동합니다.")
    }
}