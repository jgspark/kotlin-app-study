package com.onejkspark.order.domain.order

import com.onejkspark.order.config.ProductsEmptyError
import com.onejkspark.order.domain.product.ProductService

interface OrderPrintService {
    fun print()
}

class OrderPrintServiceImpl constructor(
    private val productService: ProductService
) : OrderPrintService {

    override fun print() {

        val products = productService.findAll()

        if (products.isEmpty()) throw ProductsEmptyError()

        println("상품번호 상품명                                   판매가격              판매수량")

        products.forEach { it ->
            println("${it.num} ${it.name}            ${it.price}               ${it.count}")
        }
    }
}
