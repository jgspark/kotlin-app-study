package com.onejkspark.pattern.builder

class Component private constructor() {

    private var param1: String? = null
    private var param2: String? = null
    private var param3: String? = null

    class Builder {

        private var param1: String? = null
        private var param2: String? = null
        private var param3: String? = null

        // setter method
        fun param1(param1: String?) = apply { this.param1 = param1 }
        fun param2(param2: String?) = apply { this.param2 = param2 }
        fun param3(param3: String?) = apply { this.param3 = param3 }

        internal fun getParam1() = this.param1
        internal fun getParam2() = this.param2
        internal fun getParam3() = this.param3

        // create to main class method
        fun build() = Component(this)
    }

    class Param2AndParam3Builder {

        private var param2: String? = null

        private var param3: String? = null

        fun param2(value: String?) = apply {
            this.param2 = value
        }

        fun param3(value: String?) = apply {
            this.param3 = value
        }

        fun build() = Component(this)

        internal fun getParam2() = this.param2

        internal fun getParam3() = this.param3
    }

    // Builder 별 생성자
    private constructor(builder: Builder) : this() {
        this.param1 = builder.getParam1()
        this.param2 = builder.getParam2()
        this.param3 = builder.getParam3()
    }

    private constructor(builder: Param2AndParam3Builder) : this() {
        this.param2 = builder.getParam2()
        this.param3 = builder.getParam3()
    }

    fun getParam1() = this.param1
    fun getParam2() = this.param2
    fun getParam3() = this.param3
}
