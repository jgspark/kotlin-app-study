package com.onejkspark.caffe.domain.barista

import com.onejkspark.caffe.domain.menu.Caffe
import com.onejkspark.caffe.domain.menu.Item
import java.math.BigDecimal

data class Barista constructor(
    val name: String,
    val money: BigDecimal
) {

    /**
     * 커피의 생성을 바리스타에게 위임 한다.
     * 바리스타는 커피를 만든다.
     */
    fun makeCaffe(menuItem: Item): Caffe {

        return Caffe(menuItem)
    }

    private fun pushMoney(money: BigDecimal) {
        this.money.add(money)
    }
}
