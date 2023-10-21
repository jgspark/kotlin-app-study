package com.onejkspark.kotlininaction.reflection

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class ReflectionMainTest {

    @Test
    @Throws(Exception::class)
    fun `문자열_리플랙션`() {

        // given

        val stringClass = String::class

        // when

        // then

        assertEquals("kotlin.String", stringClass.qualifiedName)
        assertFalse(stringClass.isData)
        assertFalse(stringClass.isCompanion)
        assertFalse(stringClass.isAbstract)
        assertTrue(stringClass.isFinal)
        assertFalse(stringClass.isSealed)
    }
}
