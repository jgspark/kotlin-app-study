package com.onejkspark.jetbrain.coroutines

import kotlinx.coroutines.delay

suspend fun doSomethingUsefulOne(): Int {
    delay(1000L)
    return 13
}

suspend fun doSomethingUsefulTwo(): Int {
    delay(1000L)
    return 29
}
