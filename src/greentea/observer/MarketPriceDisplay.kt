package greentea.observer

class MarketPriceDisplay(stockData: StockData) : Observer {

    private var marketPrice: Double? = null
    private var totalStocks: Int = stockData.totalStocks

    init {
        stockData.registerObserver(this)
    }

    override fun update(price: Double, totalStocks: Int) {
        marketPrice = price
        this.totalStocks = totalStocks
        display()
    }

    private fun display() {
        if (marketPrice == null) {
            println("NASDAQ is not open")
        } else {
            println("$marketPrice")
        }
    }
}