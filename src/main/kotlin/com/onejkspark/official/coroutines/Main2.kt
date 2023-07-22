package com.onejkspark.official.coroutines

import kotlinx.coroutines.runBlocking


fun main() {

    val total: Int = runBlocking {
        val one = doSomethingUsefulOne()
        val two = doSomethingUsefulTwo()
        one + two
    }

    println("total : $total")

}
