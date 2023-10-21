package com.onejkspark.order

import com.onejkspark.order.config.App
import java.util.Scanner

fun main(args: Array<String>) {

    val sc: Scanner = Scanner(System.`in`)

    val (productService, orderPrintService) = App.init()

    println("입력(o[order]: 주문, q[quit]: 종료):")

    val type = sc.next()

    if ("o" == type) {

        orderPrintService.print()

        println("상품번호:")

        val num = sc.next()

        println("갯수:")

        val count = sc.next()
    } else {
        sc.close()
    }
}
