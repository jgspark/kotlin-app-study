package com.onejkspark.pattern.factory

import com.onejkspark.pattern.factory.button.Button
import com.onejkspark.pattern.factory.button.HtmlButton

class HtmlDialog : Dialog() {


    override fun createdButton(): Button = HtmlButton()

}
