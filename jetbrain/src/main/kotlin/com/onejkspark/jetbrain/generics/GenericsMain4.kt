package com.onejkspark.jetbrain.generics


class GenericsMain4


fun main(args: Array<String>) {

    val listNumber: MutableList<in Number> = mutableListOf(1, 2, 3)

    val listInt: MutableList<in Int> = listNumber

    val listInt2: MutableList<Int> = mutableListOf(1, 2, 3, 45)

    for (i in listInt) {
        (i as Int).dec()
    }

    for (i in listInt2) {
        i.dec()
    }
}


