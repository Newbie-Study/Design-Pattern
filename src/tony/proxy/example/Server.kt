package tony.proxy.example

interface Server {
    fun register(id: String, password: String): Boolean
    fun login(id: String, password: String): Boolean
}

class RealServer : Server {
    private val accounts = hashMapOf<String, String>()

    override fun register(id: String, password: String): Boolean {
        if (accounts[id] == password) {
            return false;
        }
        accounts[id] = password
        return true
    }

    override fun login(id: String, password: String): Boolean {
        return accounts[id] == password
    }
}

class ProxyServer : Server {
    private lateinit var server: Server

    override fun register(id: String, password: String): Boolean {
        if (!::server.isInitialized) {
            server = RealServer()
        }
        return server.register(id, password)
    }


    override fun login(id: String, password: String): Boolean {
        if (!::server.isInitialized) {
            server = RealServer()
        }
        return server.login(id, password)
    }
}