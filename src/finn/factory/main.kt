package finn.factory

import finn.factory.service.ServiceView

fun main(){
    val serviceViewWithoutCustom = ServiceView()
    val serviceViewWithCustom = ServiceView()

    println("[No Custom]")
    serviceViewWithoutCustom.initServiceWithoutCustom()
    serviceViewWithoutCustom.show()

    println("[Custom]")
    serviceViewWithCustom.initServiceWithCustom()
    serviceViewWithCustom.show()
}