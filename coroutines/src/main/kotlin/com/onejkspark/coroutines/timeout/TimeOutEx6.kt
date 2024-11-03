package com.onejkspark.coroutines.timeout

import kotlinx.coroutines.NonCancellable
import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import mu.KotlinLogging

class TimeOutEx6

private val log = KotlinLogging.logger { }

fun main() = runBlocking {

    val job = launch {

        try {

            repeat(1000) { i ->
                log.info { "job: i'm sleeping $i ..." }
                delay(500L)
            }
        } finally {
            withContext(NonCancellable) {
                log.info { "job: i'm running finally" }
                delay(1000)
                log.info { "job: and i've just delayed for 1 sec because i'm non-cancellable" }
            }
        }
    }

    delay(1300)
    log.info { "main: i'm tired of waiting!" }
    job.cancelAndJoin()
    log.info { "main: now i can quit." }
}
