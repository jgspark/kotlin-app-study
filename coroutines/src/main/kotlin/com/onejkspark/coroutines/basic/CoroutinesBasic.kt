package com.onejkspark.coroutines.basic

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class CoroutinesBasic

/**
 *
 */
fun main() = runBlocking {
    launch {
        delay(1000L)
        println("${Thread.currentThread().name} : World!")
    }
    println("${Thread.currentThread().name} : Hello")
}
