package com.onejkspark.oop

data class Ex1 constructor(
    private val name: String,
    private val content: String
) {
    fun name() = this.name
    fun content() = this.content
}
