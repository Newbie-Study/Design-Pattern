package tony.decorator.practice

class Soy(private val beverage: Beverage) : CondimentDecorator() {
    override var description: String
        get() = "${beverage.description}, 두유"
        set(value) {}

    override fun cost(): Double {
        return .15 + beverage.cost()
    }
}