package com.onejkspark.coroutines.timeout

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout
import mu.KotlinLogging

class TimeOutEx9

private val log = KotlinLogging.logger { }

private var acquired = 0

private class Resource {

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
                val res = withTimeout(60) {
                    delay(50)
                    Resource()
                }
                res.close()
            }
        }
    }

    log.info { acquired }
}
