package com.onejkspark.coroutines.basic

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import mu.KotlinLogging

class CoBase2

private val log = KotlinLogging.logger { }

fun main() {
    runBlocking {
        log.info { "Main 1 >>>> ${Thread.currentThread().name}" }

        CoroutineScope(Dispatchers.Default).launch {
            log.info { Thread.currentThread().name }
        }

        val job = CoroutineScope(Dispatchers.IO).async {
            delay(1000)
            log.info { Thread.currentThread().name }
        }

        log.info { "Main 2 >>>> ${Thread.currentThread().name}" }

        job.await()
    }
}
