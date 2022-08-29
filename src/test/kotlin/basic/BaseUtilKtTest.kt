package basic

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Test

internal class BaseUtilKtTest {

    @Test
    fun `논리 연산자 테스트`() {
        val flag = isBigerInt(100)
        assertEquals(flag, Flag.T)
    }

    @Test
    fun `테스트 케이스1`() {
        val value = test1()
        assertNull(value)
    }

    @Test
    fun `테스트 케이스2`() {
        val value = test1()?.length
        assertNull(value)
    }

    @Test
    fun `테스트 케이스3`() {
        val value = test1()?.length ?: -1
        assertEquals(value, -1)
    }
}