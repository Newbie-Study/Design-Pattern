package greentea.command

class LazyGadget {

    private val orders = mutableListOf<Command>()

    init {
        println("나는야 4차산업혁명의 결정체 만능 로봇 가제트")
        println("삐리비릭 명령을 내려주세요 - 나와라 만능팔\n")
    }

    fun takeCommand(command: Command) {
        orders.add(command)
    }

    fun doCommands() {
        orders.forEach {
            it.execute()
        }
        sendLogs()
        orders.clear()
    }

    private fun sendLogs() {
        println("\n다음의 로그를 보냅니다.")
        orders.forEach { println(it.getLog()) }
    }
}