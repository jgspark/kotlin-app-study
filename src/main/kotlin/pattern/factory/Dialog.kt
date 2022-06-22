package pattern.factory

import pattern.factory.button.Button

abstract class Dialog {

    fun renderWindow() {
        val button = createdButton()
        button.render()
    }

    abstract fun createdButton(): Button
}