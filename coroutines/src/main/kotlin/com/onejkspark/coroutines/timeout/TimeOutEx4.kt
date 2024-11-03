package com.onejkspark.coroutines.timeout

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import mu.KotlinLogging

class TimeOutEx4

private val log = KotlinLogging.logger { }

fun main() = runBlocking {

    val start = System.currentTimeMillis()

    val job = launch(Dispatchers.Default) {

        var next = start
        var i = 0

        while (isActive) { // 코루틴 API 에서 제공을 해줌 ...
            if (System.currentTimeMillis() >= next) {
                log.info { "job: i'm sleeping ${i++}" }
                next += 500
            }
        }
    }

    delay(1300)
    log.info { "main: i'm tired of waiting!" }
    job.cancelAndJoin()
    log.info { "main: now i can quit." }
}
