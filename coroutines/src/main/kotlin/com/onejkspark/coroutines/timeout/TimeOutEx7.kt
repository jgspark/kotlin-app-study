package com.onejkspark.coroutines.timeout

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout
import mu.KotlinLogging

class TimeOutEx7

private val log = KotlinLogging.logger { }

fun main() = runBlocking {

    withTimeout(1300L) {
        repeat(1000) { i ->
            log.info { "running $i ...!!" }
            delay(500)
        }
    }
}
