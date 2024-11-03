package com.onejkspark.coroutines.mdc

import com.onejkspark.coroutines.mdc.util.MdcKeyStore.NUM_KEY
import mu.KotlinLogging
import org.slf4j.MDC

class MdcMain

private val logger = KotlinLogging.logger {}

fun main(args: Array<String>) {

    MDC.put(NUM_KEY, "1")

    val value = MDC.get(NUM_KEY)

    logger.info { ">>>>> $value" }
}
