package com.onejkspark.pattern.factory.button

import com.onejkspark.pattern.factory.button.Button

class WindowsButton : Button {
    override fun render() {
        println("window button")
        onClick()
    }

    override fun onClick() {
        println("Click! Window Button")
    }
}
