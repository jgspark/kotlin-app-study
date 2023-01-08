package pattern.decorator

interface DataConvert {

    fun write(string: String)

    fun read(): String
}


class DataConvertImpl(private val data: String) : DataConvert {

    override fun write(string: String) {
        data
    }

    override fun read(): String {
        return data
    }
}
