package jayden.observer.practice.display

import jayden.observer.practice.subject.Subject

class HeatIndexDisplay(
    weatherData: Subject
) : Observer, DisplayElement {

    private var heatIndex: Float = 0.0f

    init {
        weatherData.registerObserver(this)
    }

    private fun computeHeatIndex(t: Float, hm: Float): Float {
        return ((16.923 + (0.185212 * t) + (5.37941 * hm) - (0.100254 * t * hm)
                + (0.00941695 * (t * t)) + (0.00728898 * (hm * hm))
                + (0.000345372 * (t * t * hm)) - (0.000814971 * (t * hm * hm)) +
                (0.0000102102 * (t * t * hm * hm)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
                (hm * hm * hm)) + (0.00000142721 * (t * t * t * hm)) +
                (0.000000197483 * (t * hm * hm * hm)) - (0.0000000218429 * (t * t * t * hm * hm)) +
                0.000000000843296 * (t * t * hm * hm * hm)) -
                (0.0000000000481975 * (t * t * t * hm * hm * hm))).toFloat()
    }

    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        heatIndex = computeHeatIndex(temperature, humidity)

        display()
    }

    override fun display() {
        println("Heat index is $heatIndex")
    }
}