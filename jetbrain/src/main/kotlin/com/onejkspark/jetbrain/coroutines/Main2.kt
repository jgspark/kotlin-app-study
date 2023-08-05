package com.onejkspark.jetbrain.coroutines

import kotlinx.coroutines.runBlocking


fun main() {

    val total: Int = runBlocking {
        val one = doSomethingUsefulOne()
        val two = doSomethingUsefulTwo()
        one + two
    }

    println("total : $total")

}
