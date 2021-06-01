package finn.adapter

class Jvm : OperatingSystem {
    override fun compile(sourceFile: JavaSourceFile) {
        println(sourceFile.code)
    }
}