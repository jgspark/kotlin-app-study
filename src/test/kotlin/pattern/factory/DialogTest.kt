package pattern.factory

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

internal class DialogTest {

    // mock data
    companion object {
        private var dialog: Dialog? = null
    }


    // html data
    @Nested
    internal class Html {

        @BeforeEach
        fun init() {
            dialog = HtmlDialog()
        }

        @Test
        fun onClick() {
            dialog?.renderWindow()
        }

    }

    // window data
    @Nested
    internal class Window {

        @BeforeEach
        fun init() {
            dialog = WindowDialog()
        }

        @Test
        fun onClick() {
            dialog?.renderWindow()
        }

    }
}