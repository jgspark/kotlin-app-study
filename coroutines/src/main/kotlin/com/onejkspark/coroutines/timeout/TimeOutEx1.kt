package com.onejkspark.coroutines.timeout

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import mu.KotlinLogging

class TimeOutEx1

private val log = KotlinLogging.logger { }

fun main() = runBlocking {

    val job = launch {
        repeat(1000) { i ->
            log.info { "job: I'm sleeping $i" }
            delay(500)
        }
    }

    delay(1300)
    log.info { "main: I'm tired of waiting!" }
    // 삭제 메소드를 사용하지 않으면 1000 번 까지 증가를 하게 됨
    // job 의 경우 삭제 메소드를 통해서 컨트롤이 가능 ..
    job.cancel()
    job.join()
    log.info { "main: No I can quit." }
}
