package jayden.observer.practice.subject

import jayden.observer.practice.display.Observer

class WeatherData : Subject {

    private val observers = mutableListOf<Observer>()

    var temperature: Float = 0.0f
        private set
    var humidity: Float = 0.0f
        private set
    var pressure: Float = 0.0f
        private set

    override fun registerObserver(o: Observer) {
        observers.add(o)
    }

    override fun removeObserver(o: Observer) {
        observers.remove(o)
    }

    override fun notifyObservers() {
        observers.forEach { observer ->
            observer.update(temperature, humidity, pressure)
        }
    }

    private fun measurementsChanged() {
        notifyObservers()
    }

    fun setMeasurements(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        measurementsChanged()
    }
}