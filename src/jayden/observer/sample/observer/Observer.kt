package jayden.observer.sample.observer

import jayden.observer.sample.observable.ActiveObservable

interface Observer {
    fun update(obs: ActiveObservable)
}