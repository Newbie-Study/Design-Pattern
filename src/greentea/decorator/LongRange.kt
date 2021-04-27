package greentea.decorator

class LongRange(private val tesla: Tesla) : OptionDecorator() {
    override fun getOptionList(): MutableList<String> {
        return tesla.getOptionList().apply { add("Long Range") }
    }

    override fun cost(): Int {
        return tesla.cost() + 500
    }
}