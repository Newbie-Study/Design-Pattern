package tony.decorator.practice

abstract class CondimentDecorator : Beverage() {
    abstract override var description: String
}