package pattern.decorator


fun main() {

    val inputString = "test,1\ntest1,2\ntest2,3"


    val decorator =
        PasserDecorator(
            target = DataConvertImpl(inputString)
        )


    decorator.write(inputString)
    println(">> input")
    println(inputString)
    println(">> encode")
    println(decorator.read())


}
