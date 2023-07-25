package com.onejkspark.official.generics


class GenericsMain4


fun main(args: Array<String>) {

    val listNumber: MutableList<in Number> = mutableListOf(1, 2, 3)

    val listInt: MutableList<in Int> = listNumber

    val listInt2: MutableList<Int> = mutableListOf(1, 2, 3, 45)

    for (i in listInt) {
        println(i.dec())
    }

    for (i in listInt2) {
        println(i.dec())
    }
}


