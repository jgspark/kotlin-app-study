package oop

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class EncapsulationTest {


    private val mockName = "test1"

    private val mockContent = "test11"

    @Test
    fun `Encapsulation Case Test`() {
        val ex1 = Ex1(mockName, mockContent)
        assertEquals(ex1.name(), mockName)
        assertEquals(ex1.content(), mockContent)
    }

    @Test
    fun `Encapsulation Case Test2`() {

        val changeName = "changedName"

        val ex2 = Ex1(mockName, mockContent)

        val mockEx2 = ex2.copy(name = changeName)

        assertEquals(mockEx2.name(), changeName)
        assertEquals(mockEx2.content(), mockContent)
    }
}