package finn.factory.service

import finn.factory.library.StartPage

class CustomStartPage : StartPage() {

    override val title: String
        get() = "Custom Start Page"
}