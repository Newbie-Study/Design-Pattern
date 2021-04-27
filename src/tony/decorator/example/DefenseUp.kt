package tony.decorator.example

import kotlin.random.Random

class DefenseUp(private val item: Item) : EnhancementItem() {
    override val name: String
        get() = if (isSuccessful) "방어업 ${item.name}" else item.name

    override val defense: Int
        get() = if (isSuccessful) item.defense + enhanceDefense else item.defense

    override val percentage: Int
        get() = 80

    override val enhanceDefense: Int
        get() = 8

    override fun enhance() {
        if(isUsed){
            println("이미 강화를 시도했습니다")
            return
        }

        isUsed = true
        isSuccessful = if (Random.nextInt(100) <= percentage) {
            println("강화에 성공했습니다. ${item.name}의 방어력이 $enhanceDefense 만큼 증가했습니다.")
            true
        } else {
            println("강화에 실패했습니다.")
            false
        }
    }
}