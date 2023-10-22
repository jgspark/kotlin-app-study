package com.onejkspark.coroutines.basic1

import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import mu.KotlinLogging

class Main5

private val log = KotlinLogging.logger { }

fun main() = runBlocking {

    val job: Job = launch {
        delay(1000L)
        log.info { "World!" }
    }

    log.info { "Hello" }

    job.join()

    log.info { "Done" }
}
