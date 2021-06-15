package greentea.composite

fun main() {

    val clientTeam = Team("Tony", "And, iOS. PC, Mac")
    val lolTeam = Team("Finn", "Kakao 4th Representative")

    val rootTeam = Team("Jayden", "절대지존")

    rootTeam.add(clientTeam)
    rootTeam.add(lolTeam)

    clientTeam.apply {
        add(Part("greentea", "안드로이드 파트").apply { supplementPeople(10) })
        add(Part("latte", "iOS 파트").apply { supplementPeople(2) })
    }

    Chief(rootTeam).printOrgs()
}