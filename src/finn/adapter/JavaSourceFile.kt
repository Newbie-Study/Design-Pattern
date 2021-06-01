package finn.adapter

class WindowSourceFile : JavaSourceFile {
    override val type: OperatingSystemType
        get() = OperatingSystemType.WINDOW

    override val code: String
        get() = "write by window"
}

class LinuxSourceFile : JavaSourceFile {
    override val type: OperatingSystemType
        get() = OperatingSystemType.LINUX

    override val code: String
        get() = "write by linux"
}

class MacSourceFile : JavaSourceFile {
    override val type: OperatingSystemType
        get() = OperatingSystemType.MAC

    override val code: String
        get() = "write by mac"
}

interface JavaSourceFile {
    val type: OperatingSystemType
    val code: String
}

enum class OperatingSystemType {
    WINDOW, MAC, LINUX
}