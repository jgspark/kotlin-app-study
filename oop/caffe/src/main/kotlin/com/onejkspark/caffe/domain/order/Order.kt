package com.onejkspark.caffe.domain.order

import com.onejkspark.caffe.domain.menu.Item
import java.math.BigDecimal

data class Order constructor(
    val id: Long,
    var type: Type,
    val menuItem: Item,
    val money: BigDecimal
) {

    fun make() {
        this.type = Type.MAKE
    }

    fun end() {
        this.type = Type.END
    }

    enum class Type {
        WAIT, MAKE, END
    }

    companion object {
        fun of(id: Long, menuItem: Item): Order = Order(id, Type.WAIT, menuItem, menuItem.amount)
    }
}
