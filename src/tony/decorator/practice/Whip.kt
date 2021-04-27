package tony.decorator.practice

class Whip(private val beverage: Beverage) : CondimentDecorator() {
    override var description: String
        get() = "${beverage.description}, 휘핑 크림"
        set(value) {}

    override fun cost(): Double {
        return .10 + beverage.cost()
    }
}