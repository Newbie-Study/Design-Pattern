package finn.state

fun main() {

    val car = Car()

    car.setMode(DriveMode())
    car.drive()

    car.setMode(ComportMode())
    car.drive()

    car.setMode(EchoMode())
    car.drive()
}
