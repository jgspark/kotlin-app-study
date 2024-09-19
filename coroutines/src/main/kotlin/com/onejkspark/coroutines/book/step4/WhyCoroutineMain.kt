package com.onejkspark.coroutines.book.step4

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

class WhyCoroutineMain

fun main() {
    runBlocking { myFunction() }
}

private suspend fun myFunction() {
    println("Before")
    delay(1000)
    println("After")
}

//private fun myFunction2(
//    continuation: Continuation<Unit>
//): Any {
//
//    val continuation = continuation as? MyFunction2Continuation ?: MyFunction2Continuation(continuation)
//
//    if (continuation.label == 0) {
//        println("Before")
//        continuation.label = 1
//
//        if (delay(10000, continuation) == COROUTINE_SUSPEND) {
//            return COROUTINE_SUSPEND
//        }
//
//    }
//
//    if (continuation.label == 1) {
//        println("After")
//        return Any()
//    }
//
//    error("Impossible")
//}

//fun delay(i: Int, continuation: MyFunction2Continuation): Any {
//    TODO("Not yet implemented")
//}
//
//val COROUTINE_SUSPEND = 1L
//
//private class MyFunction2Continuation(
//    val continuation: Continuation<Unit>,
//) : Continuation<Unit> {
//
//    override val context: CoroutineContext
//        get() = this.continuation.context
//
//    var label: Int = 0
//    var result: Result<Any>? = null
//
//    override fun resumeWith(result: Result<Unit>) {
//        this.result = result
//        val res = try {
//            val r = myFunction(this)
//            if (r == COROUTINE_SUSPEND) return
//            Result.success(r as Unit)
//        } catch (e: Exception) {
//            Result.failure(e)
//        }
//        continuation.resumeWith(res)
//    }
//}
