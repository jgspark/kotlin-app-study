package com.onejkspark.pattern.abstractfactory

class Window : OS {

    override fun started() = OsType.WINDOW

    override fun end() {
        println("윈동우 OS 종료")
    }
}
