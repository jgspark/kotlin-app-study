package com.onejkspark.official.classes

import com.onejkspark.official.classes.Person
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class PersonTest {

    @Test
    fun `생성자 init 적용 안될 때`() {
        val name = "test1"
        val person = Person(name)
        assertNotEquals(person.name, name)
    }

    @Test
    fun `생성자 init 적용`() {

        val person = Person("init")

        assertEquals("test", person.name)
    }
}
