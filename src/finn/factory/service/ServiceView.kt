package finn.factory.service

import finn.factory.library.MainView

class ServiceView {

    private val mainView = MainView()

    fun initServiceWithCustom(){
        mainView.addFactory(CustomStartPageFactory())
        mainView.addFactory(CustomEndPageFactory())
        mainView.startView()
    }

    fun initServiceWithoutCustom(){
        mainView.startView()
    }

    fun show(){
        println(mainView.getTitle())
    }
}