package com.onejkspark.coroutines.basic1

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import mu.KotlinLogging

class Main6

private val log = KotlinLogging.logger { }

fun main() = runBlocking {
    repeat(50_00) {
        launch {
            delay(5000L)
            log.info {
                "."
            }
        }
    }
}
