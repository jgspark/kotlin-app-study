package com.onejkspark.coroutines.basic1

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import mu.KotlinLogging

class Main3

private val log = KotlinLogging.logger {}

fun main() = runBlocking {
    doHelloWorld()
    Unit
}

private suspend fun doHelloWorld() = coroutineScope {
    launch {
        delay(1000L)
        log.info { "world" }
    }
    log.info { "hello" }
}
