package greentea.decorator

class Model3 : Tesla() {

    override fun getOptionList(): MutableList<String> {
        return mutableListOf(Manual.MODEL_3)
    }

    override fun cost(): Int {
        return 5000
    }
}