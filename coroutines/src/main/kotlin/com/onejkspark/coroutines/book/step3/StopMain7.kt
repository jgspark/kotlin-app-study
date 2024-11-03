package com.onejkspark.coroutines.book.step3

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import mu.KotlinLogging
import kotlin.coroutines.Continuation
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

class StopMain7

private val log = KotlinLogging.logger { }

var continuation: Continuation<Unit>? = null

suspend fun suspendAndSetContinuation() {
    suspendCoroutine<Unit> {
        log.info { "this 1 main" }
        continuation = it
    }
}

suspend fun main() = coroutineScope {
    println("B")
    launch {
        log.info { "this 2" }
        kotlinx.coroutines.delay(1000)
        continuation?.resume(Unit)
    }

    log.info { "this 3 main" }
    suspendAndSetContinuation()
    println("A")
}
