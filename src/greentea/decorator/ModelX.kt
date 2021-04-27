package greentea.decorator

class ModelX : Tesla() {

    override fun getOptionList(): MutableList<String> {
        return mutableListOf(Manual.MODEL_X)
    }

    override fun cost(): Int {
        return 12500
    }
}