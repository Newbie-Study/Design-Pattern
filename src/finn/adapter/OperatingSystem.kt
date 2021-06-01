package finn.adapter

class Window : OperatingSystem {
    override fun compile(sourceFile: JavaSourceFile) {
        when (sourceFile.type) {
            OperatingSystemType.WINDOW -> println(sourceFile.code)
            else -> println("WindowCompiler : Operating system not same")
        }
    }
}

class Linux : OperatingSystem {
    override fun compile(sourceFile: JavaSourceFile) {
        when (sourceFile.type) {
            OperatingSystemType.LINUX -> println(sourceFile.code)
            else -> println("LinuxCompiler : Operating system not same")
        }
    }
}

class Mac : OperatingSystem {
    override fun compile(sourceFile: JavaSourceFile) {
        when (sourceFile.type) {
            OperatingSystemType.MAC -> println(sourceFile.code)
            else -> println("MacCompiler : Operating system not same")
        }
    }
}

interface OperatingSystem {
    fun compile(sourceFile: JavaSourceFile)
}
