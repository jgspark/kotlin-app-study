package com.onejkspark.caffe.domain.customer

import com.onejkspark.caffe.domain.menu.IMenu
import com.onejkspark.caffe.domain.order.Order
import java.math.BigDecimal
import java.util.Random

data class Customer constructor(
    val name: String,
    var money: BigDecimal
) {

    /**
     * 주문자 관점에서 어떤 메뉴인지 모른다.
     * 단순하게 선택에 관점에서 행동하는 메소드이다.
     */
    fun order(name: String, menu: IMenu): Order {

        // 매뉴를 선택한다.
        val menuItem = menu.choose(name)

        // 나의 돈을 소비
        useMoney(menuItem.amount)

        // 그리고 주문
        return Order.of(Random().nextLong(), menuItem)
    }

    private fun useMoney(useMoney: BigDecimal) {
        this.money = this.money.subtract(useMoney)
    }
}
