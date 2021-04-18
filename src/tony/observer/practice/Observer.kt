package tony.observer.practice

interface Observer {
    fun update(temperature: Float, humidity: Float, pressure: Float)
}