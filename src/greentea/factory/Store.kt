package greentea.factory

import java.security.InvalidParameterException

abstract class Store {

    fun orderCar(type: String): Tesla {
        val car = makeCar(type)

        println(
            """
            |battery : ${car.battery}
            |factory : ${car.productionPlace}
            |eco friendliness : ${car.ecoFriendliness}
            |""".trimMargin()
        )

        println("get your car!")

        return car
    }

    protected abstract fun makeCar(type: String): Tesla
}

class CaliStore : Store() {
    override fun makeCar(type: String): Tesla {
        val factory = CaliforniaFactory()

        return when (type) {
            "Model3" -> Model3(factory)
            "ModelX" -> ModelX(factory)
            else -> throw InvalidParameterException("there's no type $type")
        }
    }
}

class ShanghaiStore : Store() {
    override fun makeCar(type: String): Tesla {
        val factory = ShanghaiFactory()

        return when (type) {
            "Model3" -> Model3(factory)
            "ModelX" -> ModelX(factory)
            else -> throw InvalidParameterException("there's no type $type")
        }
    }
}

// seald class ???