package tony.decorator.example

class Shield : Item() {
    override val name: String
        get() = "방패"

    override val defense: Int
        get() = super.defense + 5
}