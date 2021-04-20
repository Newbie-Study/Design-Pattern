package jayden.observer.sample.observable

import jayden.observer.sample.observer.Observer

interface ActiveObservable {
    fun addObserver(observer: Observer)
    fun removeObserver(observer: Observer)
    fun removeObservers()
    fun notifyObservers()
    fun considerNotify()
    fun isActive(): Boolean
}