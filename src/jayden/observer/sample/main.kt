package jayden.observer.sample

import jayden.observer.sample.observable.NotificationManager
import jayden.observer.sample.observer.Galaxy
import jayden.observer.sample.observer.IPhone

fun main() {
    val notificationManager = NotificationManager()

    with(notificationManager) {
        addObserver(Galaxy())
        addObserver(IPhone())
    }

    with(notificationManager) {
        setTimeHour(23)
        setPushMessage("재난 문자 발송")
        setTimeHour(5)
        setTimeHour(9)
        setPushMessage("확진자 동선 안내")
    }

    notificationManager.removeObservers()
}