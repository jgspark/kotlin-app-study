package com.onejkspark.order.domain.product

/**
 * Is Entity
 */
data class Product constructor(
    val num: Int,
    val name: String,
    val price: String,
    val count: Int,
) {
    constructor(strArray: List<String>) : this(
        num = strArray[0].toInt(),
        name = strArray[1],
        price = strArray[2],
        count = strArray[3].toInt(),
    )
}
