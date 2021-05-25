package greentea.command

interface Command {
    fun execute()
    fun getLog(): String
}

class BuyStockCommand : Command {
    override fun execute() {
        println("영끌로 하이닉스 주식을 풀매수합니다")
    }

    override fun getLog(): String = this.javaClass.simpleName
}

class DriveStartCommand : Command {
    override fun execute() {
        println("운전을 시작합니다.")
    }

    override fun getLog(): String = this.javaClass.simpleName

}

class HeadSpinCommand : Command {
    override fun execute() {
        println("휙휙휙휙휙휙휙")
    }

    override fun getLog(): String = this.javaClass.simpleName
}