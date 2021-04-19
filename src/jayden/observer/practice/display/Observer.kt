package jayden.observer.practice.display

interface Observer {
    fun update(temperature: Float, humidity: Float, pressure: Float)
}