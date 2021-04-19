package jayden.observer.practice.display

import jayden.observer.practice.subject.Subject

class ForecastDisplay(
    weatherData: Subject
) : Observer, DisplayElement {

    private var currentPressure: Float = 29.92f
    private var lastPressure: Float = 0.0f

    init {
        weatherData.registerObserver(this)
    }

    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        lastPressure = currentPressure
        currentPressure = pressure

        display()
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