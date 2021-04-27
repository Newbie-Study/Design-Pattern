package tony.decorator.practice

abstract class Beverage {
    open var description = "제목 없음"

    abstract fun cost(): Double
}