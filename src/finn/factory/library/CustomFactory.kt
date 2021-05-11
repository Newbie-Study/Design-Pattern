package finn.factory.library

interface CustomFactory{

    fun getType(): String

    companion object {
        const val START_VIEW_TYPE = "START_VIEW_TYPE"
        const val END_VIEW_TYPE = "END_VIEW_TYPE"
    }

}
