package pattern.decorator

open class DataDecorator(
    private val target: DataConvert
) : DataConvert {

    override fun write(string: String) {
        target.write(string)
    }

    override fun read(): String = this.target.read()
}
