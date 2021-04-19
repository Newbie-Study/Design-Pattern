package tony.observer.tony

class User(private val name: String) : Observer {
    override fun update(difference: Float) {
        if(difference > 0){
            println("${name}은 ${difference}%의 수익을 냈습니다!")
        }else if(difference < 0){
            println("${name}은 ${difference}%의 손실을 냈습니다!")
        }
    }
}