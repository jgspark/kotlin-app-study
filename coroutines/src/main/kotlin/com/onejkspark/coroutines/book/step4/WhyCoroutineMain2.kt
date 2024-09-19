package com.onejkspark.coroutines.book.step4

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

class WhyCoroutineMain2

fun main() {
    runBlocking {
        myFunction()
    }
}

private suspend fun myFunction() {
    println("Before")
    var cnt = 0
    delay(1000)
    cnt++
    println("this cnt is $cnt")
    println("After")
}

private suspend fun myFunction2() {
    println("Before")
    getUser(1)
    getUserWithContent(2)
    println("After")
}

fun getUserWithContent(i: Int) {
    TODO("Not yet implemented")
}

fun getUser(i: Int) {
    TODO("Not yet implemented")
}

