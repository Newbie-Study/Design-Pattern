package jayden.decorator.practice.beverage

class DarkRoast(override var size: Size) : Beverage() {

    override val description: String = "다크 로스트 커피"

    override val cost: Double = .99
}