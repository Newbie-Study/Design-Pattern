package finn.factory.library

abstract class EndPage {

    abstract val title: String

    interface Factory : CustomFactory {
        fun create(): EndPage
    }
}