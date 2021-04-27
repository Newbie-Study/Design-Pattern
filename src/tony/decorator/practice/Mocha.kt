package tony.decorator.practice

class Mocha(private val beverage: Beverage) : CondimentDecorator() {
    override var description: String
        get() = "${beverage.description}, 모카"
        set(value) {}

    override fun cost(): Double {
        return .20 + beverage.cost()
    }
}