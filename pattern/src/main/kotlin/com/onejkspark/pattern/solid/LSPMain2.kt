package com.onejkspark.pattern.solid

class LSPMain2


fun main() {

    val mockString = "hello"

    work(mockString)

    println("------")

    workForString(mockString)
}


fun work(any: Any) {
    println(any)
}


fun workForString(any: String) {
    println(any.plus(" my home"))
}
