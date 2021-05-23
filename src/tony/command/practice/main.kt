package tony.command.practice

fun main() {
    val remoteCommand = RemoteControl()

    val livingRoomLight: Light = Light("Living Room")
    val kitchenLight: Light = Light("Kitchen")
    val stereo = Stereo("Living Room")

    val livingRoomLightOn = LightOnCommand(livingRoomLight)
    val livingRoomLightOff = LightOffCommand(livingRoomLight)
    val kitchenLightOn = LightOnCommand(kitchenLight)
    val kitchenLightOff = LightOffCommand(kitchenLight)

    val stereoOnWithCDCommand = StereoOnWithCDCommand(stereo)
    val stereoOffWithCDCommand = StereoOffWithCDCommand(stereo)

    remoteCommand.setCommand(0, livingRoomLightOn, livingRoomLightOff)
    remoteCommand.setCommand(1, kitchenLightOn, kitchenLightOff)
    remoteCommand.setCommand(2, stereoOnWithCDCommand, stereoOffWithCDCommand)

    println(remoteCommand)
    remoteCommand.onButtonWasPushed(0)
    remoteCommand.offButtonWasPushed(0)
    remoteCommand.onButtonWasPushed(1)
    remoteCommand.offButtonWasPushed(1)
    remoteCommand.onButtonWasPushed(2)
    remoteCommand.offButtonWasPushed(2)
}