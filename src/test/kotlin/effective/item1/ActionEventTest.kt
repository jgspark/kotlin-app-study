package effective.item1

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.concurrent.thread
import kotlin.properties.Delegates

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

    @Test
    fun `list`() {

        var list2: List<Int> = listOf()

        list2 += 1

        assertEquals(1, list2.size)

    }

    @Test
    fun `멀티 스레드 테스트`() {

        var list = listOf<Int>()

        for (i in 1..1000) {
            thread {
                list = list + i
            }
        }

        Thread.sleep(1000)

        assertNotEquals(1000, list.size)

    }

    @Test
    fun `델리게이트 추적`() {

        var names by Delegates.observable(listOf<String>()) { _, old, new ->
            println("Names changed from $old to $new")
        }

        names += "Fabio"

        names += "Bill"

        assertEquals(2, names.size)
    }

}