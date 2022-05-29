package sequential.max

import java.util.Scanner

class Max {

    fun max(a: Int, b: Int, c: Int): Int {
        var max = a
        if (b > max) max = b
        if (c > max) max = c
        return max
    }
}

fun main() {

    val scanner = Scanner(System.`in`)

    println("새 정수의 최대 값을 구하시오.")

    println("a 값:")
    val a = scanner.nextInt()

    println("b 값:")
    val b = scanner.nextInt()

    println("c 값:")
    val c = scanner.nextInt()

    val max = Max()

    var maxNumber = max.max(a, b, c)

    println("최대 값은?:${maxNumber}")
}