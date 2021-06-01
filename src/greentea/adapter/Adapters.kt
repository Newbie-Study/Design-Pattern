package greentea.adapter

interface OutdatedPay {
    fun payWithCompliacatedWay()
    fun certifyUser()
}

class SimplePayAdapter constructor(private val simplePay: SimplePay) : OutdatedPay {

    override fun payWithCompliacatedWay() {
        simplePay.simplePay()
    }

    override fun certifyUser() {
        simplePay.loadPlatformAccount()
    }
}