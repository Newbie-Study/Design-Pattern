package finn.factory.library

/*
 * 라이브러리에 제공될 뷰
 */
class MainView {

    private val factoryMap = HashMap<String, CustomFactory?>()

    private var startView: StartPage? = null
    private var endView: EndPage? = null

    fun addFactory(factory: CustomFactory){
        factoryMap[factory.getType()] = factory
    }

    fun startView(){
        val startFactory = factoryMap[CustomFactory.START_VIEW_TYPE] as? StartPage.Factory
        startView = startFactory?.create() ?: DefaultStartPage()

        val endFactory = factoryMap[CustomFactory.END_VIEW_TYPE] as? EndPage.Factory
        endView = endFactory?.create() ?: DefaultEndPage()
    }

    fun getTitle() = "StartPage : ${startView?.title}, EndPage : ${endView?.title}"

}