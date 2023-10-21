package com.onejkspark.caffe.domain.menu

import java.lang.RuntimeException
import java.math.BigDecimal

interface IMenu {
    fun choose(name: String): Item
}

data class Menu constructor(
    val menuItems: List<Item>
) : IMenu {

    override fun choose(name: String): Item = this.menuItems.firstOrNull {
        it.name == name
    } ?: throw RuntimeException("없는 메뉴 입니다.")
}

data class Item(
    val name: String, val amount: BigDecimal
)

data class Caffe constructor(
    val name: String,
    val amount: BigDecimal
) {
    constructor(menuItem: Item) : this(menuItem.name, menuItem.amount)
}
