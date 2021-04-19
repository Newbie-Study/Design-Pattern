package greentea.observer

interface Subject {
    fun registerObserver(o: Observer)
    fun unregisterObserver(o: Observer)
    fun notifyObservers()
}