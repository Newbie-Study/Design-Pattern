package finn.command

class ConventionCommand(private val convention: Convention) : Command {
    override fun execute() {
        convention.show()
    }
}

class Convention(val name: String) {
    fun show() = println("코딩 컨벤션 : $name")
}