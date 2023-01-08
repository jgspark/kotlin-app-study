package pattern.decorator

import java.util.Base64

class EncodeDecorator(target: DataConvert) : DataDecorator(target) {

    override fun write(string: String) {
        super.write(encode(string))
    }

    override fun read(): String {
        return decode(super.read())
    }

    private fun encode(data: String): String {
        val encoder: Base64.Encoder = Base64.getEncoder()
        return encoder.encodeToString(data.toByteArray())
    }

    private fun decode(data: String): String {
        val decoder: Base64.Decoder = Base64.getDecoder()
        return String(decoder.decode(data))
    }
}
