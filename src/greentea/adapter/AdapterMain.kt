package greentea.adapter

fun main() {

    val kakaoPayAdapter = SimplePayAdapter(KakaoPay())
    val naverPayAdapter = SimplePayAdapter(NaverPay())

    kakaoPayAdapter.certifyUser()
    kakaoPayAdapter.payWithCompliacatedWay()

    naverPayAdapter.certifyUser()
    naverPayAdapter.payWithCompliacatedWay()
}