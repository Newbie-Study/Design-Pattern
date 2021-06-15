package greentea.composite

class Team(headName: String, orgDescription: String) : OrgComponent {

    override var head = headName
    override var description = orgDescription
    val orgs = ArrayList<OrgComponent>()

    fun add(org: OrgComponent) {
        orgs.add(org)
    }

    override fun print() {

        println("===================================")
        println("팀장 : $head\n팀 역할 : $description\n")

        val iterator = orgs.iterator()
        while (iterator.hasNext()) {
            iterator.next().print()
        }
    }
}

class Part(headName: String, orgDescription: String) : OrgComponent {

    override var head = headName
    override var description = orgDescription
    private var numberOfPeople: Int = 0

    fun supplementPeople(num: Int) {
        numberOfPeople += num
    }

    override fun print() {
        println("파트장 : $head\n파트 역할 : $description\n인원 : $numberOfPeople\n")
    }
}