package com.onejkspark.coroutines.book.step3

import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine

class StopMain6

suspend fun main() {
    suspendCoroutine<Unit> {
        it.resumeWithException(RuntimeException("Oops!"))
    }
}
