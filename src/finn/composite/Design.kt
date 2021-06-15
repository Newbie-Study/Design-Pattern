package finn.composite

class Design : Group {

    private val designGroup = ArrayList<Group>()

    override fun work() {
        println("나는 디자인 대장, 밑에 사람들 일해라")

        for(d in designGroup) d.work()
    }

    fun addDesigner(designer: Group) = designGroup.add(designer)
}

class IconDesigner : Group {
    override fun work() {
        println("나는 아이콘 디자이너, 아이콘 제작 ")
    }
}

class BannerDesigner : Group {

    override fun work() {
        println("나는 배너 디자이너, 배너 제작")
    }
}