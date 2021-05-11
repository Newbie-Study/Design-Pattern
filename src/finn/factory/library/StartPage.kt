package finn.factory.library

abstract class StartPage {

    abstract val title: String

    interface Factory : CustomFactory{
        fun create() : StartPage
    }

}