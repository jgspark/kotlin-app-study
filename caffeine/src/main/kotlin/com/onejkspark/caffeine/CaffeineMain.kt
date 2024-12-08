package com.onejkspark.caffeine

import com.github.benmanes.caffeine.cache.Caffeine
import java.util.concurrent.TimeUnit


class CaffeineMain

private const val CACKE_KEY = "caffeine::"

fun main() {

    val cache = Caffeine.newBuilder()
        // 10 초 동안 캐싱
        .expireAfterWrite(10, TimeUnit.SECONDS).maximumSize(10).build<String, String>()

    for (i in 1..10) {
        cache.put("$CACKE_KEY::$i", "test_$i")
    }

    for (i in 1..10) {

        val value = cache.getIfPresent("$CACKE_KEY::$i")

        println("cache value is $value")
    }
}
