package pattern.builder

class Component private constructor(builder: Builder) {

    private var param1: String? = null
    private var param2: String? = null
    private var param3: String? = null

    class Builder {

        private var param1: String? = null
        private var param2: String? = null
        private var param3: String? = null

        // setter method
        fun param1(param1: String?) = apply { this@Builder.param1 = param1 }
        fun param2(param2: String?) = apply { this@Builder.param2 = param2 }
        fun param3(param3: String?) = apply { this@Builder.param3 = param3 }

        fun getParam1() = this.param1
        fun getParam2() = this.param2
        fun getParam3() = this.param3

        // create to main class method
        fun build() = Component(this)
    }

    // constructor init data
    init {
        this.param1 = builder.getParam1()
        this.param2 = builder.getParam2()
        this.param3 = builder.getParam3()
    }


    fun getParam1() = this.param1
    fun getParam2() = this.param2
    fun getParam3() = this.param3
}