package tony.decorator.io

import java.io.*

fun main() {
    try {
        val `in`: InputStream = LowerCaseInputStream(BufferedInputStream(FileInputStream("./src/tony/decorator/io/test.txt")))

        var c: Int = `in`.read()
        while (c >= 0) {
            print(c.toChar())
            c = `in`.read()
        }
        `in`.close()
    } catch (e: IOException) {
        e.printStackTrace()
    }
}