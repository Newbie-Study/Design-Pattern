package greentea.observer

class StockData(closingPrice: Double) : Subject {

    private var marketPrice = closingPrice
    var totalStocks = 100
    private var observers = mutableListOf<Observer>()

    override fun registerObserver(o: Observer) {
        observers.add(o)
    }

    override fun unregisterObserver(o: Observer) {
        val targetIdx = observers.indexOf(o)
        observers.removeAt(targetIdx)
    }

    override fun notifyObservers() {
        observers.forEach { observer ->
            observer.update(marketPrice, totalStocks)
        }
    }

    fun setMarketPrice(price: Double) {
        marketPrice = price
        notifyObservers()
    }

    fun splitStock(splitNumber: Int) {
        totalStocks *= splitNumber
        marketPrice /= splitNumber
        notifyObservers()
    }
}