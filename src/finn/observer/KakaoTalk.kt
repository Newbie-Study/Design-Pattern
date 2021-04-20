package finn.observer

interface Alarm {
    fun onAlarm(device: Device)
    fun offAlarm(device: Device)
    fun notifyTalk(talk: String)
}

class KakaoTalk : Alarm{
    private val deviceList = mutableListOf<Device>()

    fun receiveTalk(talk: String) {
        notifyTalk("카톡 : $talk")
    }

    override fun onAlarm(device: Device) {
        deviceList.add(device)
        println("${device.javaClass.name.replace("finn.observer.", "")} 카톡 알람 켜기")
    }

    override fun offAlarm(device: Device) {
        deviceList.remove(device)
        println("${device.javaClass.name.replace("finn.observer.", "")} 카톡 알람 끄기")
    }

    override fun notifyTalk(talk: String) {
        deviceList.forEach {
            it.showTalk(talk)
        }
    }
}