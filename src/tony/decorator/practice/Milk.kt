package tony.decorator.practice

class Milk(private val beverage: Beverage) : CondimentDecorator() {
    override var description: String
        get() = "${beverage.description}, 스팀 밀크"
        set(value) {}

    override fun cost(): Double {
        return .10 + beverage.cost()
    }
}