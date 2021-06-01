package finn.adapter

fun main() {
    val windowFile = WindowSourceFile()
    val linuxFile = LinuxSourceFile()
    val macFile = MacSourceFile()

    println("===== not use jvm window =====")
    val noJvmWindow : OperatingSystem = Window()
    noJvmWindow.run {
        compile(windowFile)
        compile(linuxFile)
        compile(macFile)
    }
    println("===== not use jvm linux =====")
    val noJvmLinux : OperatingSystem = Linux()
    noJvmLinux.run {
        compile(windowFile)
        compile(linuxFile)
        compile(macFile)
    }
    println("===== use jvm window =====")
    val jvmWindow : OperatingSystem = Jvm()
    jvmWindow.run {
        compile(windowFile)
        compile(linuxFile)
        compile(macFile)
    }
}