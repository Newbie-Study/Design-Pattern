package jayden.observer.sample.observable

import jayden.observer.sample.observer.Observer

class NotificationManager : ActiveObservable {

    var pushMessage: String = "Default Message"
        private set

    private var timeHour: Int = 0

    private val observers = mutableListOf<Observer>()

    private var hasChanged: Boolean = false // PushMessage 변경 Flag

    override fun addObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    override fun removeObservers() {
        observers.clear()
    }

    override fun notifyObservers() {
        observers.forEach {
            it.update(this)
        }
        hasChanged = false
    }

    override fun isActive(): Boolean {  // 아침 8시 부터 오후 10시 전까지만 PushMessage 수신 가능
        return timeHour in 8 until 22
    }

    override fun considerNotify() {
        if (isActive().not()) return

        if (hasChanged) {
            notifyObservers()
        }
    }

    fun setPushMessage(message: String) {
        if (message.isBlank()) return

        pushMessage = message
        hasChanged = true

        considerNotify()
    }

    fun setTimeHour(hour: Int) {
        timeHour = hour

        considerNotify()
    }
}