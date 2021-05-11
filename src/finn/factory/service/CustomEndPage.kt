package finn.factory.service

import finn.factory.library.EndPage

class CustomEndPage : EndPage() {

    override val title: String
        get() = "Custom End Page"
}