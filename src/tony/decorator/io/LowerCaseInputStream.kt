package tony.decorator.io

import java.io.FilterInputStream
import java.io.InputStream

class LowerCaseInputStream(`in`: InputStream) : FilterInputStream(`in`) {
    override fun read(): Int {
        val c = super.read()
        return if (c == -1) c else Character.toLowerCase(c.toChar()).toInt()
    }

    override fun read(b: ByteArray, offset: Int, len: Int): Int {
        val result = super.read(b, offset, len)
        for (i in offset..offset + result) {
            b[i] = Character.toLowerCase(b[i].toChar()).toByte()
        }
        return result
    }
}