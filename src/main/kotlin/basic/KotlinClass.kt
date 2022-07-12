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