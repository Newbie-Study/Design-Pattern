package greentea.decorator

abstract class Tesla {

    abstract fun getOptionList(): MutableList<String>

    abstract fun cost(): Int

    fun showState() {
        getOptionList().forEachIndexed { i, option ->
            if (i == 0) println("$option\n--------------------")
            else println("Option $i : $option")
        }
        println(
            "--------------------\n" +
                    "Total Cost : ${cost()}\n\n"
        )
    }
}