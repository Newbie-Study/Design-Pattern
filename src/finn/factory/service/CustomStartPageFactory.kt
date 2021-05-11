package finn.factory.service

import finn.factory.library.CustomFactory
import finn.factory.library.StartPage

class CustomStartPageFactory : StartPage.Factory {

    override fun create(): StartPage = CustomStartPage()

    override fun getType(): String = CustomFactory.START_VIEW_TYPE
}