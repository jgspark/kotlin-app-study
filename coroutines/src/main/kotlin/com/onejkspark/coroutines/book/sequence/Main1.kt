package com.onejkspark.coroutines.book.sequence

class Main1

fun main() {
    val seq = sequence {

        println(">>> 1")

        yield(1)

        println(">>> 2")

        yield(2)

        println(">>> 3")

        yield(3)
    }

    val iterator = seq.iterator()

    iterator.next()

    iterator.next()

    iterator.next()
}
