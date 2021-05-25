package finn.command

fun main() {
    val gccDebuggerCommand = DebugCommand(Debugger("gcc"))
    val jvmCommand = DebugCommand(Debugger("jvm"))

    val cConvention = ConventionCommand(Convention("c"))
    val javaConvention = ConventionCommand(Convention("java"))


    Idea().apply {
        changeCommand(gccDebuggerCommand)
        debug()

        changeCommand(jvmCommand)
        debug()

        changeCommand(cConvention)
        refactoring()

        changeCommand(javaConvention)
        refactoring()
    }
}