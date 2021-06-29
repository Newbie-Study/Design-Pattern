package greentea.state

fun main() {

    val student = TroubleMaker(2)

    student.smoke()
    student.smoke()
    student.smoke()
    student.serve()

    student.smoke()
    student.smoke()
    student.smoke()
    student.extort()
    student.extort()

}