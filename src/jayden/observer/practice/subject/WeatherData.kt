package jayden.observer.practice.subject

import java.util.*

class WeatherData : Observable() {

    var temperature: Float = 0.0f
        private set
    var humidity: Float = 0.0f
        private set
    var pressure: Float = 0.0f
        private set

    private fun measurementsChanged() {
        setChanged()
        notifyObservers()
    }

    fun setMeasurements(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        measurementsChanged()
    }
}