package com.onejkspark.pattern.factory.button

class HtmlButton : Button {

    override fun render() {
        println("Html Button")
        this.onClick()
    }

    override fun onClick() {
        println("Click! Html Button")
    }
}
