package greentea.observer

interface Observer {
    fun update(price: Double, totalStocks: Int)
}