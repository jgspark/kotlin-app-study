package pattern.decorator


interface Decorator {
    fun action(): Int
}

class DecoratorImpl(
    private val num: Int
) : Decorator {
    override fun action(): Int = num
}

open class CalculationDecorator(
    private val target: Decorator
) : Decorator {
    override fun action(): Int = this.target.action()
}

class PlusDecorator(target: CalculationDecorator, private val plusNum: Int) : CalculationDecorator(target) {

    override fun action(): Int {
        return super.action() + plusNum
    }
}

class SubtractDecorator(target: CalculationDecorator, private val subNum: Int) : CalculationDecorator(target) {
    override fun action(): Int {
        return super.action() - subNum
    }
}
