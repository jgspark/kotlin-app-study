package basic

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class KotlinClass {


    @Test
    fun `생성자 테스트 케이스`() {

        val mockName = "tester"

        val person = Person(mockName)

        assertEquals(mockName, person.getName())
    }

    @Test
    fun `init 블록 테스트 케이스 생성자를 통해서 주입 하지 않는 케이스`() {
        val initOrder = InitOrder()

        assertEquals(1, initOrder.getOrder())
    }

    @Test
    fun `init 블록 테스트 케이스 생서자를 통해서 주입을 할 때`() {

        val num = 2

        val initOrder = InitOrder(num)

        assertEquals(num, initOrder.getOrder())
    }
}