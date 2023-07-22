package com.onejkspark.pattern.decorator


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


class CheesePlusDecorator(
    target: Decorator
) : CalculationDecorator(target) {

    // 치즈 추가시 1000원 추가
    override fun action(): Int {
        return super.action() + 1000
    }
}

class HamPlusDecorator(
    target: Decorator
) : CalculationDecorator(target) {

    // 햄 추가시 2000 원
    override fun action(): Int {
        return super.action() + 2000
    }
}

class CaffePlusDecorator(
    target: Decorator
) : CalculationDecorator(target) {
    // 커피 추가시 5000 원
    override fun action(): Int {
        return super.action() + 5000
    }
}

class CokePlusDecorator(target: Decorator) : CalculationDecorator(target) {
    override fun action(): Int {
        return super.action() + 500
    }
}
