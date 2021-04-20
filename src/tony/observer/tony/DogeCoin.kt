package tony.observer.tony

import kotlin.math.abs


class DogeCoin : Subject {
    private val userMap = mutableMapOf<Observer, Pair<Observer, Int>>()
    private val users = mutableListOf<Pair<Observer, Int>>()
    private var krw = 500

    override fun addObserver(observer: Observer) {
        Pair(observer, krw).let {
            userMap[observer] = it
            users.add(it)
        }
    }

    override fun removeObserver(observer: Observer) {
        users.remove(userMap[observer])
    }

    override fun notifyObservers() {
        for (user in users) {
            val difference = (krw.toFloat() / user.second.toFloat()) * 100 - 100
            if (abs(difference) > 5) {
                user.first.update(difference)
            }
        }
    }

    fun setDogeCoin(krw: Int) {
        this.krw = krw
        notifyObservers()
    }
}