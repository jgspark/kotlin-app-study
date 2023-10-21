package com.onejkspark.order.domain.order

/**
 * order input data class
 */
data class OrderInput constructor(
    private val productNum: Int,
    private val orderCount: Int,
)
