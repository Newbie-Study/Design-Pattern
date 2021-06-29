package tony.state.example

fun main() {

    val galaxy = SmartPhone("Galaxy", 78)
    galaxy.apply {
        playOdin()
        useKakaoMap()
        useKakaoTalk()
        call("Brian")
        useKakaoMap()
        chargePhone()
    }
    println()

    val iPhone = SmartPhone("iPhone", 38)
    iPhone.apply {
        useKakaoTalk()
        playOdin()
    }
}