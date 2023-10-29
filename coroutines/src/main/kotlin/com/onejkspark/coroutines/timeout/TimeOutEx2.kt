package com.onejkspark.coroutines.timeout

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import mu.KotlinLogging

class TimeOutEx2

private val log = KotlinLogging.logger { }

fun main() = runBlocking {

    val startTime = System.currentTimeMillis()

    val job = launch(Dispatchers.Default) {

        var next = startTime
        var i = 0

        while (i < 5) {

            if (System.currentTimeMillis() >= next) {
                log.info { "job: I'm sleeping ${i++}" }
                next += 500L
            }

        }

    }

    delay(1300)
    log.info { "main: I'm tired of waiting!" }
    job.cancelAndJoin()
    log.info { "main: Now I can quit." }

}


