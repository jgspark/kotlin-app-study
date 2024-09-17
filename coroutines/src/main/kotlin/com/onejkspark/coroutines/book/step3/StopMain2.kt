package com.onejkspark.coroutines.book.step3

import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

class StopMain2

suspend fun main() {
    println("B")

    suspendCoroutine<Unit> {
        println("S1")
        Thread.sleep(1000L) // 1초 sleep
        it.resume(Unit)
        println("resume")
    }

    println("A")
}
