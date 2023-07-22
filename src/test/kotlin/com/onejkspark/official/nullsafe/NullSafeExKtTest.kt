package com.onejkspark.official.nullsafe

import com.onejkspark.official.nullsafe.nullSafeByIf
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class NullSafeExKtTest {

    @Test
    fun `null safe test case`() {

        val mock = nullSafeByIf(null)

        assertEquals("null", mock)
    }

}
