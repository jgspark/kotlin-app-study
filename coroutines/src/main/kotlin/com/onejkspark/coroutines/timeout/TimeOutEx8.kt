package com.onejkspark.coroutines.timeout

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeoutOrNull
import mu.KotlinLogging

class TimeOutEx8

private val log = KotlinLogging.logger { }

fun main() = runBlocking {
    // withTimeoutOrNull 과  withTimeout 의 경우 예외를 던지거나 , 혹은 예외 상황시 Null 반환
    val result = withTimeoutOrNull(1300L) {
        repeat(1000) { i ->
            log.info { "I'm sleeping $i ..." }
            delay(500L)
        }
        // will get cancelled before it produces this result
        "Done"
    }
    log.info { "Result is $result" }
}
