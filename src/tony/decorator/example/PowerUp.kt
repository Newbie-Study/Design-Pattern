package tony.decorator.example

import kotlin.random.Random

class PowerUp(private val item: Item) : EnhancementItem() {
    override val name: String
        get() = if (isSuccessful) "파워업 ${item.name}" else item.name

    override val attack: Int
        get() = if (isSuccessful) item.attack + enhanceAttack else item.attack

    override val percentage: Int
        get() = 60

    override val enhanceAttack: Int
        get() = 10

    override fun enhance() {
        if(isUsed){
            println("이미 강화를 시도했습니다")
            return
        }
        isUsed = true
        isSuccessful = if (Random.nextInt(100) <= percentage) {
            println("강화에 성공했습니다. ${item.name}의 공격력이 $enhanceAttack 만큼 증가했습니다.")
            true
        } else {
            println("강화에 실패했습니다.")
            false
        }
    }
}