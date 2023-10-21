package com.onejkspark.caffe.domain.menu

import java.math.BigDecimal

interface MenuRepository {
    fun getMenu(): Menu
}

class MenuKotlinRepositoryImpl : MenuRepository {

    override fun getMenu(): Menu = Menu(listOf(Item("아아", BigDecimal.ONE)))
}
