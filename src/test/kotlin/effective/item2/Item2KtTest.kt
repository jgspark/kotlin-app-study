package effective.item2

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Item2KtTest {


    @Test
    fun `fizz 메소드 테스트 케이스`() {
        assertEquals(3, fizz())
    }

    @Test
    fun `block 프로퍼티`() {

        val mockValue = "test"

        val value = test("test") {
            println(">>>> this1")
            mockValue
        }

        val value2: () -> String = {
            "test"
        }

        assertEquals(mockValue, value)
        assertEquals(mockValue, value2())
    }
}