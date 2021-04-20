package jayden.observer.practice.display

import jayden.observer.practice.subject.WeatherData
import java.util.*

class CurrentConditionDisplay(
    weatherData: Observable
) : Observer, DisplayElement {

    private var temperature: Float = 0.0f
    private var humidity: Float = 0.0f

    init {
        weatherData.addObserver(this)
    }

    override fun update(obs: Observable?, arg: Any?) {
        if (obs is WeatherData) {
            temperature = obs.temperature
            humidity = obs.humidity

            display()
        }
    }

    override fun display() {
        println("Current conditions: ${temperature}F degrees and ${humidity}% humidity")
    }
}