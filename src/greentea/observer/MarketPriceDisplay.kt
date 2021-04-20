package greentea.observer

class MarketPriceDisplay : Observer {

    private var marketPrice: Double? = null
    private var totalStocks: Int? = null

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