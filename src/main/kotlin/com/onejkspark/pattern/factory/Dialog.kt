package com.onejkspark.pattern.factory

import com.onejkspark.pattern.factory.button.Button

abstract class Dialog {

    fun renderWindow() {
        val button = createdButton()
        button.render()
    }

    abstract fun createdButton(): Button
}
