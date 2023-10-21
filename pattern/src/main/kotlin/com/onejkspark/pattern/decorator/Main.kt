package com.onejkspark.pattern.decorator

fun main() {

    // 타겟
    val target1 = CokePlusDecorator(
        HamPlusDecorator(
            target = CheesePlusDecorator(
                target = CalculationDecorator(DecoratorImpl(3000))
            )
        )
    )

    println(target1.action())

    val target2 = CaffePlusDecorator(
        target = CalculationDecorator(target = DecoratorImpl(3000))
    )

    println(target2.action())
}
