package pattern.factory

import pattern.factory.button.Button
import pattern.factory.button.HtmlButton

class HtmlDialog : Dialog() {


    override fun createdButton(): Button = HtmlButton()

}