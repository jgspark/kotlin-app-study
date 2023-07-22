package com.onejkspark.official.also

class Item {

    private var name: String? = null

    constructor() {}

    constructor(name: String) {
        this.name = name
    }

    fun getName(): String? = this.name

    fun setName(name: String) {
        this.name = name
    }

}
