package pattern.factory

import pattern.factory.button.Button
import pattern.factory.button.WindowsButton

class WindowDialog : Dialog() {

    override fun createdButton(): Button = WindowsButton()
}