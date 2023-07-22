package com.onejkspark.effectivekotlin.item5

import com.onejkspark.effectivekotlin.item5.checkToAny
import com.onejkspark.effectivekotlin.item5.checkToAnyByCustomException
import com.onejkspark.effectivekotlin.item5.checkToInt
import com.onejkspark.effectivekotlin.item5.checkToIntByCustomException
import com.onejkspark.effectivekotlin.item5.checkToLazyMessage
import com.onejkspark.effectivekotlin.item5.checkToVal
import com.onejkspark.effectivekotlin.item5.checkToValByRuntimeException
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test

internal class MultiExceptionKtTest {

    @Test
    fun `상태 체크`() {
        checkToVal(true)
    }

    @Test
    fun `상태 체크 IllegalStateException case`() {
        assertThrows(IllegalStateException::class.java) {
            checkToVal(false)
        }
    }

    @Test
    fun `상태 체크 lazyMessage`() {
        assertThrows(IllegalStateException::class.java) {
            checkToLazyMessage(false)
        }
    }

    @Test
    fun `상태 체크 to custom exception throw by RuntimeException`() {
        assertThrows(RuntimeException::class.java) {
            checkToValByRuntimeException(false)
        }
    }

    @Test
    fun `null 체크`() {
        checkToAny(1L)
    }

    @Test
    fun `null 체크 NPE case_IllegalStateException`() {
        assertThrows(IllegalStateException::class.java) {
            checkToAny(null)
        }
    }

    @Test
    fun `null 체크 Custom Exception_RuntimeException`() {
        assertThrows(RuntimeException::class.java) {
            checkToAnyByCustomException(null)
        }
    }

    @Test
    fun `강제적인 제한 성공 케이스`() {
        checkToInt(10)
    }

    @Test
    fun `강제적인 제한_IllegalArgumentException`() {
        assertThrows(IllegalArgumentException::class.java) {
            checkToInt(-1)
        }
    }

    @Test
    fun `강제적인 제한_CustomException`() {
        assertThrows(RuntimeException::class.java) {
            checkToIntByCustomException(-1)
        }
    }
}
