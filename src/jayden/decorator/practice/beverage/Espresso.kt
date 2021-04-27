package jayden.decorator.practice.beverage

class Espresso(override var size: Size) : Beverage() {

    override val description: String = "에스프레소"

    override val cost: Double = 1.99
}