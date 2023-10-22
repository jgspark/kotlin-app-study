package com.onejkspark.coroutines.basic1


import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import mu.KotlinLogging

class Main7

private val log = KotlinLogging.logger {}

fun main() = runBlocking {
    launch(Dispatchers.IO) {
        nonBlocking()
    }
    log.info { "Done" }
}


private suspend fun nonBlocking() = coroutineScope {
    async {
        delay(1000L)

        launch {
            delay(1000L)
            log.info { "word" }
        }
        log.info { "hello" }
    }
}
