package com.onejkspark.pattern.factory.button

class WindowsButton : Button {
    override fun render() {
        println("window button")
        onClick()
    }

    override fun onClick() {
        println("Click! Window Button")
    }
}
