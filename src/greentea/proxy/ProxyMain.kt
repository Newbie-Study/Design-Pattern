package greentea.proxy

fun main() {
    val authManagerProxy = AuthManagerProxy()
    authManagerProxy.authManager = KakaoAuthManager()

    authManagerProxy.login()
    authManagerProxy.logout()

    authManagerProxy.authManager = NaverAuthManager()

    authManagerProxy.login()
    authManagerProxy.logout()
}