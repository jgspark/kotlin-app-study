package com.onejkspark.pattern.factory

import com.onejkspark.pattern.factory.button.Button
import com.onejkspark.pattern.factory.button.WindowsButton

class WindowDialog : Dialog() {

    override fun createdButton(): Button = WindowsButton()
}
