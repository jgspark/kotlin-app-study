package com.onejkspark.official.generics

//import com.onejkspark.effectivekotlin.item4.Animal
import com.onejkspark.official.generics.item.Animal
import com.onejkspark.official.generics.item.Cat

class GenericsMain3

fun main(args: Array<String>) {

    val listInt: MutableList<out Int> = mutableListOf(1, 2, 3)
    val listNumber: MutableList<out Number> = listInt

    for (i in listNumber) {
        println(i.toInt())
    }
}

