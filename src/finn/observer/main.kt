package finn.observer

fun main(){

    // 주석 : 그냥 카카오톡입니다

    val kakaoTalk = KakaoTalk()
    val galaxy = Galaxy()
    val iPhone = IPhone()
    val macBook = MacBook()

    kakaoTalk.onAlarm(galaxy)
    kakaoTalk.onAlarm(iPhone)
    kakaoTalk.onAlarm(macBook)
    println()

    kakaoTalk.receiveTalk("뭐해??")

    println()
    kakaoTalk.offAlarm(galaxy)
    println()

    kakaoTalk.receiveTalk("뭐하냐고ㅡㅡ")
}
