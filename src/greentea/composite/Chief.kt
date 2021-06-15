package greentea.composite

// 조작하는 클래스
class Chief(val team: Team) {

    fun printOrgs() {
        println("=====================")
        println("내가 CEO임 이 조직들 내가 다 관리함 ㅇㅇ")
        team.print()
    }
}