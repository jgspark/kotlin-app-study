package com.onejkspark.coroutines.book.step3

import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

class StopMain4


suspend fun main() {
    println("B")
    delay(1000)
    println("A")
}

private suspend fun delay(timeMillis: Long) =
    suspendCoroutine<Unit> {
        executor.schedule({
            it.resume(Unit)
        }, timeMillis, TimeUnit.MILLISECONDS)
    }

private val executor =
    Executors.newSingleThreadScheduledExecutor {
        Thread(it, "scheduler")
            .apply {
                isDaemon = true
            }
    }
