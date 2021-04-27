package tony.decorator.practice

class HouseBlend : Beverage() {
    init {
        description = "하우스 블렌드 커피"
    }

    override fun cost(): Double {
        return .89
    }
}