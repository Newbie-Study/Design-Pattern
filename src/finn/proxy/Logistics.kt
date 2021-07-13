package finn.proxy

interface Logistics {
    fun order(id: Int) {}
}

class SmallBookStore : Logistics {
    
    private val product = Product("정의란 무엇인가", 30000)
    
    override fun order(id: Int) {
        println("작은서점 : $product")
    }
}

class Coupang : Logistics {
    
    private val wareHouse = mutableMapOf<Int, Product>().apply {
        put(1234,Product("비비고 동그랑땡",10000))
    }
    
    private val smallBookStore = SmallBookStore()

    override fun order(id: Int) {
        if(wareHouse.contains(id)) {
            println("쿠팡 로켓 배송 : ${wareHouse[id]}")   
        } else {
            smallBookStore.order(id)
        }
    }

}

data class Product(
    val name: String,
    val price: Int,
)