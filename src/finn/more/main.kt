package finn.more

fun main() {
    val driveMode = Mode { println("drive mode") }

    driveMode.drive()

    val people: People = People.of("finn", 25)
    println(people)

    val newPeople: People = NewPeople(people, "010-1234-5678")
    println(newPeople)
}

/*
 * fun interface
 */

fun interface Mode {
    fun drive() // 얘가 오버라이딩됨
}

/*
 * delegate interface
 */

interface People {
    val name: String
    val age: Int

    companion object {
        fun of(name: String, age: Int): People = PeopleImpl(name, age)
    }

    private data class PeopleImpl(override val name: String, override val age: Int) : People
}

data class NewPeople(val people: People, val number: String) : People by people