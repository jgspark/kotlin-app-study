package com.onejkspark.coroutines.basic

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class RefactorCoroutinesBasic

fun main() = runBlocking { // this: CoroutineScope
    launch { callWord() }
    println("${Thread.currentThread().name} : Hello")
}

suspend fun callWord() {
    delay(1000L)
    println("${Thread.currentThread().name} : World!")
}
