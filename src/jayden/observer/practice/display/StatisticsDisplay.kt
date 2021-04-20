package jayden.observer.practice.display

import jayden.observer.practice.subject.WeatherData
import java.util.*

class StatisticsDisplay(
    weatherData: Observable
) : Observer, DisplayElement {

    private var maxTemp: Float = 0.0f
    private var minTemp: Float = 200.0f
    private var tempSum: Float = 0.0f
    private var numReadings: Int = 0

    init {
        weatherData.addObserver(this)
    }

    override fun update(obs: Observable?, arg: Any?) {
        if (obs is WeatherData) {
            tempSum += obs.temperature
            numReadings.inc()

            if (obs.temperature > maxTemp) {
                maxTemp = obs.temperature
            }

            if (obs.temperature < minTemp) {
                minTemp = obs.temperature
            }

            display()
        }
    }

    override fun display() {
        println("Avg/Max/Min temperature = ${tempSum / numReadings}/${maxTemp}/${minTemp}")
    }
}