package effect.item1

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ActionEventTest {

    @Test
    fun `인터페이스 프로퍼티 재정의 테스트 케이스`() {

        val eventItem = ActionEvent(false)

        eventItem.active = true

        assertTrue(eventItem.active)
    }

    @Test
    fun `델리게이트`() {

        if (fullName != null) {
            println(fullName!!.length)
        }

        if (fullName2 != null) {
            println(fullName2!!.length)
        }
    }

    @Test
    fun `data class test case`() {

        val mockSurName = "Test1234"

        var user = User("test1", "test2")

        user = user.copy(
            surName = mockSurName
        )

        assertEquals(mockSurName, user.surName)
    }

}