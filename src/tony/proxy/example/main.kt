package tony.proxy.example

fun main() {
    val proxy = ProxyServer()
    val id = "tony"
    val password = "****"
    val wrongPassword = "******"

    if (proxy.register(id, password)) {
        println("회원가입 성공")
    } else {
        println("회원가입 실패")
    }

    if (proxy.login(id, wrongPassword)) {
        println("로그인 성공")
    } else {
        println("로그인 실패")
    }

    if (proxy.login(id, password)) {
        println("로그인 성공")
    } else {
        println("로그인 실패")
    }
}