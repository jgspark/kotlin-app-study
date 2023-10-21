package com.onejkspark.order.config

import com.onejkspark.order.domain.order.OrderPrintService
import com.onejkspark.order.domain.order.OrderPrintServiceImpl
import com.onejkspark.order.domain.product.ProductService
import com.onejkspark.order.domain.product.ProductServiceImpl

object App {

    fun init(): Ioc {
        // product service di
        val productService: ProductService = ProductServiceImpl()

        val orderPrintService: OrderPrintService = OrderPrintServiceImpl(productService)

        return Ioc(productService, orderPrintService)
    }
}

data class Ioc constructor(
    val productService: ProductService, val orderPrintService: OrderPrintService
)
