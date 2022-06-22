package pattern.factory.button

import pattern.factory.button.Button

class WindowsButton : Button {
    override fun render() {
        println("window button")
        onClick()
    }

    override fun onClick() {
        println("Click! Window Button")
    }
}