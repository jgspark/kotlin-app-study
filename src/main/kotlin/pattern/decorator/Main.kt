package pattern.decorator


fun main() {

    val num = 10

    var decorator = CalculationDecorator(DecoratorImpl(num))

    println("step1 ===")
    println(decorator.action())
    decorator = PlusDecorator(decorator, 10)
    println("step2 ===")
    println(decorator.action())
    println("step3 ===")
    decorator = SubtractDecorator(decorator, 20)
    println(decorator.action())
}
