package greentea.observer

fun main() {

    val stockData = StockData(closingPrice = 100.0)

    stockData.addObserver(MarketPriceDisplay())

    stockData.setMarketPrice(105.0)
    stockData.setMarketPrice(99.0)
    stockData.setMarketPrice(100.0)
    stockData.splitStock(5)
}