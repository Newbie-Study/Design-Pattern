package finn.composite

class CTO : Group {

    private val techGroup = ArrayList<Group>()

    override fun work() {
        println("나는 기술 대장, 밑에 사람들 일해라")

        for(t in techGroup) t.work()
    }

    fun addDeveloper(developer: Group) = techGroup.add(developer)
}

class ServerDeveloper : Group {
    override fun work() {
        println("나는 서버 개발자, 서버 개발")
    }
}

class FrontDevelop : Group {
    override fun work() {
        println("나는 프론트 개발자, 프론트 개발")
    }
}