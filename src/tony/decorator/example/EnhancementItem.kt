package tony.decorator.example

abstract class EnhancementItem : Item() {
    open val percentage: Int = 100
    open val enhanceAttack = 0
    open val enhanceDefense = 0
    var isUsed = false
    var isSuccessful = false

    abstract fun enhance()
}