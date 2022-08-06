package nullsafe

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class NullSafeExKtTest {

    @Test
    fun `null safe test case`() {

        val mock = nullSafeByIf(null)

        assertEquals("null", mock)
    }

}