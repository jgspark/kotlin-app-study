package sequential.max

import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)

    println("새 정수의 최대 값을 구하시오.")

    println("a 값:")
    val a = scanner.nextInt()

    println("b 값:")
    val b = scanner.nextInt()

    println("c 값:")
    val c = scanner.nextInt()

    var max = a

    if (b > max) max = b

    if (c > max) max = c

    println("최대 값은?:${max}")
}