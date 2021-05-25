package greentea.command

fun main() {

    val lazyGadget = LazyGadget()

    val buyStockCommand = BuyStockCommand()
    val driveStartCommand = DriveStartCommand()
    val headSpinCommand = HeadSpinCommand()

    lazyGadget.takeCommand(buyStockCommand)
    lazyGadget.takeCommand(driveStartCommand)
    lazyGadget.takeCommand(headSpinCommand)

    lazyGadget.doCommands()

}