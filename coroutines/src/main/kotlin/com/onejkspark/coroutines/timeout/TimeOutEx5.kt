package com.onejkspark.coroutines.timeout

import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import mu.KotlinLogging

class TimeOutEx5

private val log = KotlinLogging.logger { }

fun main() = runBlocking {

    val job = launch {

        try {
            repeat(5) { i ->

                log.info { "job: i'm sleeping $i ..." }
            }
        } catch (e: Exception) {
            log.error { e }
        } finally {
            log.info { "job: i'm running finally" }
        }
    }

    delay(1300)
    log.info { "main: i'm tired of waiting!" }
    job.cancelAndJoin()
    log.info { "main: now i can quit." }
}
