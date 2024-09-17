package com.onejkspark.coroutines.book.step3

import kotlin.concurrent.thread
import kotlin.coroutines.Continuation
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

class StopMain3

suspend fun main() {
    println("B")
    suspendCoroutine<Unit> { continueAfterSecond(it) }
    println("A")
}

fun continueAfterSecond(continuation: Continuation<Unit>) {
    thread {
        Thread.sleep(1000L)
        continuation.resume(Unit)
    }
}
