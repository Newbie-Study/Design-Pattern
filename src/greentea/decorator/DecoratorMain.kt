package greentea.decorator

fun main() {

    var myCar: Tesla = Model3()
    myCar.showState()

    myCar = FullSelfDriving(myCar)
    myCar = LongRange(myCar)
    myCar = ColorRed(myCar)
    myCar.showState()

    var yourCar: Tesla = ModelX()

    yourCar = ColorBlue(yourCar)
    yourCar.showState()

}