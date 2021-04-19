package jayden.observer.practice.subject

import jayden.observer.practice.display.Observer

interface Subject {
    fun registerObserver(o: Observer)
    fun removeObserver(o: Observer)
    fun notifyObservers()
}