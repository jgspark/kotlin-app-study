package com.onejkspark.coroutines.book.step4

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

class WhyCoroutineMain3


fun main() {
    runBlocking {
        a()
    }
}

suspend fun a() {
    b()
    b()
    b()
}

suspend fun b() {
    for (i in 1..10) {
        c(i)
    }
}

suspend fun c(i: Int) {
    delay(i * 100L)
    println("T ====> ${Thread.currentThread().name}")
}
