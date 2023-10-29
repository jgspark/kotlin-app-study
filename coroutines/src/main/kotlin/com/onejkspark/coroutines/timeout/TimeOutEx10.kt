package com.onejkspark.coroutines.timeout

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout
import mu.KotlinLogging

class TimeOutEx10

private val log = KotlinLogging.logger { }


private var acquired = 0

private class Resource2 {

    init {
        acquired++
    }

    fun close() {
        acquired--
    }
}

fun main() = runBlocking {

    runBlocking {
        repeat(10_000) {
            launch {
                var res: Resource2 = Resource2()
                try {
                    withTimeout(60) {
                        delay(50)
                        res = Resource2()
                    }
                } finally {
                    res.close()
                }
            }
        }
    }

    log.info { acquired }
}
