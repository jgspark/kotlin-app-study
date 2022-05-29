package sequential.median

import java.util.Scanner

class Median {

    fun mid(a: Int, b: Int, c: Int): Int = if (a >= b) {
        if (b >= c) b else if (a <= c) a else b
    } else if (a > c) {
        a
    } else if (b > c) {
        c
    } else {
        b
    }

}

fun main() {
    val sc = Scanner(System.`in`)

    val median = Median()

    println("a , b , c 의 중앙값은 ${median.mid(sc.nextInt(), sc.nextInt(), sc.nextInt())}")

    sc.close()
}