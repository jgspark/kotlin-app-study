package com.onejkspark.coroutines.book.step3

import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

class StopMain1

suspend fun main() {
    println("Before")

    suspendCoroutine<Unit> {
        println("Before Running- ${Thread.currentThread().name}")
        it.resume(Unit) // 코루틴 중단 이후 다시 시작
    }

    println("After")
}
