package jayden.observer.practice.display

import jayden.observer.practice.subject.Subject

class StatisticsDisplay(
    weatherData: Subject
) : Observer, DisplayElement {

    private var maxTemp: Float = 0.0f
    private var minTemp: Float = 200.0f
    private var tempSum: Float = 0.0f
    private var numReadings: Int = 0

    init {
        weatherData.registerObserver(this)
    }

    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        tempSum += temperature
        numReadings.inc()

        if (temperature > maxTemp) {
            maxTemp = temperature
        }

        if (temperature < minTemp) {
            minTemp = temperature
        }

        display()
    }

    override fun display() {
        println("Avg/Max/Min temperature = ${tempSum / numReadings}/${maxTemp}/${minTemp}")
    }
}