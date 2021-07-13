package greentea.proxy

interface Auth {
    fun login()
    fun logout()
}

class KakaoAuthManager : Auth {
    override fun login() {
        println("카카오 아이디로 로그인되었습니다.")
    }

    override fun logout() {
        println("로그아웃되었습니다.")
    }

}

class NaverAuthManager : Auth {
    override fun login() {
        println("네이버 아이디로 로그인되었습니다.")
    }

    override fun logout() {
        println("로그아웃되었습니다.")
    }

}

class AuthManagerProxy : Auth {

    var authManager: Auth? = null
        set(value) {
            value?.let {
                println("${it.javaClass.simpleName} 방식이 선택되었습니다.")
            }
            field = value
        }

    override fun login() {
        authManager?.login()
    }

    override fun logout() {
        authManager?.logout()
        println()
    }

}