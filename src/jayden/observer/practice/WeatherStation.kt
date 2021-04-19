package jayden.observer.practice

import jayden.observer.practice.display.CurrentConditionDisplay
import jayden.observer.practice.display.ForecastDisplay
import jayden.observer.practice.display.HeatIndexDisplay
import jayden.observer.practice.display.StatisticsDisplay
import jayden.observer.practice.subject.WeatherData

class WeatherStation {
    fun main() {
        val weatherData = WeatherData()

        CurrentConditionDisplay(weatherData)
        StatisticsDisplay(weatherData)
        ForecastDisplay(weatherData)
        HeatIndexDisplay(weatherData)

        weatherData.setMeasurements(80.0f, 65.0f, 30.4f)
        weatherData.setMeasurements(82.0f, 70.0f, 29.2f)
        weatherData.setMeasurements(78.0f, 90.0f, 29.2f)
    }
}

fun main() {
    val weatherStation = WeatherStation()
    weatherStation.main()
}