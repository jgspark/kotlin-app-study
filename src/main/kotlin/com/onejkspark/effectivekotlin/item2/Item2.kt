package com.onejkspark.effectivekotlin.item2


val a = 1

fun fizz(): Int {
    val b = 2
    return a + b
}

val buzz = {
    val c = 3
    a + c
}


class User constructor(val name: String)

var list = listOf<User>()

fun users() {

    //#1
    var user: User
    for (i in list.indices) {
        user = list[i]
    }

    //#2
    for (i in list.indices) {
        val user = list[i]
    }

    //#3
    for ((i, user) in list.withIndex()) {
    }

}

fun users2() {

    //#1
    val user: User

    val boolean: Boolean = true

    val name = "tester"

    if (boolean) {
        user = User(name)
    } else {
        user = User(name)
    }

    //#2
    val user2 = if (boolean) {
        User(name)
    } else {
        User(name)
    }
}

enum class Color {
    BLUE, YELLOW, RED
}

//#1
fun updatedWeather1(degrees: Int) {

    val description: String
    val color: Int

    if (degrees < 5) {
        description = "cold"
        color = Color.BLUE.ordinal
    } else if (degrees < 23) {
        description = "mild"
        color = Color.YELLOW.ordinal
    } else {
        description = "hot"
        color = Color.RED.ordinal
    }
}

//#2
fun updatedWeather2(degrees: Int) {

    val (description, color) = when {
        degrees < 5 -> "colod" to Color.BLUE.ordinal
        degrees < 23 -> "mild" to Color.YELLOW.ordinal
        else -> "hot" to Color.RED.ordinal
    }
}

fun <T> test(arg: String, block: () -> T?): T? {
    println("this2")
    return block()
}
