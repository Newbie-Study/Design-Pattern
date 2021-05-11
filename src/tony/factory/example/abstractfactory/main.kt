package tony.factory.example.abstractfactory

fun main() {
    val mcDonald: BurgerStore = McDonald()
    mcDonald.orderBurger("빅맥").run {
        info()
    }

    val momsTouch: BurgerStore = MomsTouch()
    momsTouch.orderBurger("화이트 갈릭 버거").run {
        info()
    }
}