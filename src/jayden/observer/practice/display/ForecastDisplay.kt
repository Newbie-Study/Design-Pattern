package jayden.observer.practice.display

import jayden.observer.practice.subject.WeatherData
import java.util.*

class ForecastDisplay(
    weatherData: Observable
) : Observer, DisplayElement {

    private var currentPressure: Float = 29.92f
    private var lastPressure: Float = 0.0f

    init {
        weatherData.addObserver(this)
    }

    override fun update(obs: Observable?, arg: Any?) {
        if (obs is WeatherData) {
            lastPressure = currentPressure
            currentPressure = obs.pressure

            display()
        }
    }

    override fun display() {
        print("Forecast: ")
        when {
            currentPressure > lastPressure -> {
                println("Improving weather on the way!")
            }
            currentPressure == lastPressure -> {
                println("More of the same")
            }
            currentPressure < lastPressure -> {
                println("Watch out for coller, rainy weather")
            }
        }
    }
}