package com.onejkspark.coroutines.basic1

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import mu.KotlinLogging

class Main4

private val log = KotlinLogging.logger {}

fun main() = runBlocking {
    doHelloWorld()
    log.info { "Done" }
    Unit
}

private suspend fun doHelloWorld() = coroutineScope {

    // L1
    launch {
        delay(2000L)
        log.info { "world 2" }
    }

    // L2
    launch {
        delay(1000L)
        log.info { "world 1" }
    }

    log.info { "hello" }
}
