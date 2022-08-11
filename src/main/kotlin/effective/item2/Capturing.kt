package effective.item2


// example1
fun ex1() {

    var numbers = (2..100).toList()

    val primes = mutableListOf<Int>()

    while (numbers.isNotEmpty()) {

        val prime = numbers.first()

        primes.add(prime)

        numbers = numbers.filter { it % prime != 0 }
    }

}

fun ex2() = sequence {
    var numbers = generateSequence(2) { it + 1 }

    while (true) {

        val prime = numbers.first()

        yield(prime)

        numbers = numbers.drop(1).filter { it % prime != 0 }

    }
}