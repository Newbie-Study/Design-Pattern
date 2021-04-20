package jayden.observer.sample.observer

import jayden.observer.sample.observable.NotificationManager
import jayden.observer.sample.observable.ActiveObservable

class Galaxy : Observer, Display {

    private var pushMessage: String = ""

    override fun update(obs: ActiveObservable) {
        if (obs is NotificationManager) {
            pushMessage = obs.pushMessage

            display()
        }
    }

    override fun display() {
        println("Galaxy Push Message Arrived : $pushMessage")
    }
}