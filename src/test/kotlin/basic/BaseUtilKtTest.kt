package basic

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class BaseUtilKtTest {


    @Test
    fun `논리 연산자 테스트`() {
        val flag = isBigerInt(100)
        assertEquals(flag, Flag.T)
    }
}