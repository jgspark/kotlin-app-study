package com.onejkspark.coroutines.basic1

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import mu.KotlinLogging

class BasicMain

private val log = KotlinLogging.logger {}

fun main() = runBlocking {














    launch {
        delay(1000L)
        log.info { "word" }
    }

    log.info { "hello" }
}
