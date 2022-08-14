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

    @Test
    fun `data class component N`() {
        val fakeName = "test1"
        val fakePhoneNumber = "010-0000-0000"
        val (name, phoneNumber) = PersonItem(fakeName, fakePhoneNumber)
        assertEquals(fakeName, name)
        assertEquals(fakePhoneNumber, phoneNumber)
    }

    @Test
    fun `data class component N other case`() {
        val fakeName = "test1"
        val fakePhoneNumber = "010-0000-0000"
        val personItem = PersonItem(fakeName, fakePhoneNumber)
        assertEquals(fakeName, personItem.component1())
        assertEquals(fakePhoneNumber, personItem.component2())
    }
}