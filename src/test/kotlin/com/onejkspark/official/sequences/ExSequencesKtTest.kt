package com.onejkspark.official.sequences

import org.junit.jupiter.api.Test

internal class ExSequencesKtTest {


    @Test
    fun `ex1`(){

        val oddNums = generateSequence(1) { it -> it + 2 }

        val test = oddNums.toList()
    }

    @Test
    fun `ex2`(){

        val oddNumbers = sequence {
            yield(1)
            yieldAll(listOf(3, 5))
            yieldAll(generateSequence(7) { it + 2 })
        }

        println(oddNumbers.take(5).toList())

    }
}
