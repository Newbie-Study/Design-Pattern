package greentea.decorator

class ColorBlue(private val tesla: Tesla) : OptionDecorator() {
    override fun getOptionList(): MutableList<String> {
        return tesla.getOptionList().apply { add("Blue") }
    }

    override fun cost(): Int {
        return tesla.cost()
    }
}