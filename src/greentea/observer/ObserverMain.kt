package greentea.observer

fun main() {

    val stockData = StockData(closingPrice = 100.0)

    MarketPriceDisplay(stockData)

    stockData.setMarketPrice(105.0)
    stockData.setMarketPrice(99.0)
    stockData.setMarketPrice(100.0)
    stockData.splitStock(5)
}