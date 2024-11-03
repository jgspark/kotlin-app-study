package com.onejkspark.coroutines.timeout

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import mu.KotlinLogging

class TimeOutEx3

private val log = KotlinLogging.logger { }

fun main() = runBlocking {

    val job = launch(Dispatchers.Default) {
        repeat(5) { i ->

            try {
                log.info { "job: i'm sleeping $i ..." }
            } catch (e: Exception) {
                log.info { e }
            }
        }
    }

    delay(1300)
    log.info { "main: i'm tired of waiting!" }
    job.cancelAndJoin()
    log.info { "main: now i can quit." }
}
