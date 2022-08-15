package basic

class Person constructor(private val name: String) {

    fun getName() = this.name
}

class InitOrder {

    private var order: Int? = null

    constructor()

    constructor(order: Int) {
        this.order = order
    }

    init {
        // 초기값 할당
        order = 1
    }

    fun getOrder() = this.order
}

abstract class AbstractTestAction {
    open fun action() = "test"
}

class TestAction : AbstractTestAction() {
    override fun action(): String {
        return super.action()
    }
}

data class PersonItem(
    val name: String,
    val phoneNumber: String
){

    val otherName : String = "test"
}

open class Shape {
    open val number = 0
}

class Rectangle : Shape(){
    override val number: Int get() = super.number
}