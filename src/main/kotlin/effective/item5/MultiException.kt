package effective.item5

import java.lang.RuntimeException

fun checkToVal(isState: Boolean) {
    check(isState)
}

fun checkToValByRuntimeException(isState: Boolean) {
    check(isState) {
        throw RuntimeException("fail")
    }
}

fun checkToLazyMessage(boolean: Boolean) {
    check(boolean) {
        "test custom message"
    }
}

fun checkToAny(value: Any?) {
    checkNotNull(value)
}

fun checkToAnyByCustomException(value: Any?) {
    checkNotNull(value) {
        throw RuntimeException("fail")
    }
}

fun checkToInt(value: Int) {
    require(value > 0)
}

fun checkToIntByCustomException(value: Int) {
    require(value > 0) {
        throw RuntimeException("test")
    }
}

fun assertToVal(value: Int) {
    assert(value == 0)
}