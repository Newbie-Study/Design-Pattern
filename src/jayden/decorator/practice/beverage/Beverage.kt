package jayden.decorator.practice.beverage

abstract class Beverage {

    enum class Size {
        TALL, GRANDE, VENTI
    }

    open val description: String = "제목 없음"

    abstract val cost: Double

    open var size: Size = Size.TALL
}