package jayden.decorator.practice.beverage

class HouseBlend(override var size: Size) : Beverage() {

    override val description: String = "하우스 블렌드 커피"

    override val cost: Double = .89
}