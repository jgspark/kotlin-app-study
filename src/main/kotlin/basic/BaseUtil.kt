package basic

enum class Flag {
    T, F
}

fun isBigerInt(val1: Int) = if (val1 in 100..500) Flag.T else Flag.F