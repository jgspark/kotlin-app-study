package com.onejkspark.official.coroutines

import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis


fun main() {

    val time = runBlocking {
        measureTimeMillis {
            val one = doSomethingUsefulOne()
            val two = doSomethingUsefulTwo()
            println("The answer is ${one + two}")
        }
    }

    println("Completed in $time ms")
}
