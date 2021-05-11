package finn.factory.service

import finn.factory.library.CustomFactory
import finn.factory.library.EndPage

class CustomEndPageFactory : EndPage.Factory {

    override fun create(): EndPage  = CustomEndPage()

    override fun getType(): String = CustomFactory.END_VIEW_TYPE
}