package greentea.decorator

class ColorRed(private val tesla: Tesla) : OptionDecorator() {
    override fun getOptionList(): MutableList<String> {
        return tesla.getOptionList().apply { add("Red") }
    }

    override fun cost(): Int {
        return tesla.cost()
    }
}