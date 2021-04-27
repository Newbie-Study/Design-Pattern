package tony.decorator.example

class Sword : Item() {
    override val name: String
        get() = "검"

    override val attack: Int
        get() = super.attack + 10
}