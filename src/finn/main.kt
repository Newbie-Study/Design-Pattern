import finn.observer.Galaxy
import finn.observer.IPhone
import finn.observer.KakaoTalk
import finn.observer.MacBook

fun main(){

    val kakaoTalk = KakaoTalk()
    val galaxy = Galaxy()
    val iPhone = IPhone()
    val macBook = MacBook()

    kakaoTalk.onAlarm(galaxy)
    kakaoTalk.onAlarm(iPhone)
    kakaoTalk.onAlarm(macBook)

    kakaoTalk.receiveTalk("뭐해??")

    kakaoTalk.offAlarm(galaxy)
    println()

    kakaoTalk.receiveTalk("뭐하냐고ㅡㅡ")
}
