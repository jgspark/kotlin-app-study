package com.onejkspark.coroutines.book.step3

import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

class StopMain5

suspend fun main() {
    println("B")
    val user = requestUser()
    println("A $user")
}

suspend fun requestUser(): User {
    return suspendCoroutine {
        it.resume(User("John Doe", 10))
    }
}

data class User(val name: String, val age: Int)
