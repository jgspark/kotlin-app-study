package com.onejkspark.coroutines.basic

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import mu.KotlinLogging

class CoBase3

private val log = KotlinLogging.logger {}

fun main() {

    // 메인 프로그램이 끝나면 이 코루틴도 함께 종료됩니다.
    GlobalScope.launch(Dispatchers.Default) {
        repeat(10) {
            log.info { "${Thread.currentThread().name} Running .." }
            delay(50000L)
        }
    }

    // 메인 스레드에서 다른 작업 수행
    log.info { "Main thread is running ${Thread.currentThread().name}" }
    Thread.sleep(2000L) // 2초 동안 메인 스레드 유지
    log.info { "Main thread is done ${Thread.currentThread().name}" }
}
