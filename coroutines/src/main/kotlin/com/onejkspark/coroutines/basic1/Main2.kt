package com.onejkspark.coroutines.basic1

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import mu.KotlinLogging

class Main2

private val log = KotlinLogging.logger {}

fun main() = runBlocking {
    launch {
        doWorld()
    }
    log.info { "hello" }
}

private suspend fun doWorld() {
    delay(1000L)
    log.info { "word" }
}
