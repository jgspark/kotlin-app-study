package pattern.decorator

import java.lang.Exception

class PasserDecorator(target: DataConvert) : DataDecorator(target) {

    override fun write(string: String) {
        super.write(string)
    }

    override fun read(): String = passer(super.read())

    private fun passer(data: String): String = data.split("\n").asSequence().map {
        var m: String? = null
        try {
            m = it.split(",")[1]
        } catch (e: Exception) {
            e.printStackTrace()
        }
        m
    }.filter {
        it != null
    }.joinToString {
        it.toString()
    }
}
