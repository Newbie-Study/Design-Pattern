package jayden.observer.practice.display

import jayden.observer.practice.subject.Subject

class CurrentConditionDisplay(
    weatherData: Subject
) : Observer, DisplayElement {

    private var temperature: Float = 0.0f
    private var humidity: Float = 0.0f

    init {
        weatherData.registerObserver(this)
    }

    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity

        display()
    }

    override fun display() {
        println("Current conditions: ${temperature}F degrees and ${humidity}% humidity")
    }
}