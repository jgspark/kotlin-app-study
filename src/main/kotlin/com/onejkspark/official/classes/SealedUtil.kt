package com.onejkspark.official.classes

enum class ErrorType constructor(private val code: String) {
    Base1Error("001"),
    Base2Error("002"),
    Base3Error("003"),
    DefaultError("000")
}

sealed class CustomError(val errorType: ErrorType) : RuntimeException() {
    constructor() : this(ErrorType.DefaultError)
}

class Base1Error() : CustomError(ErrorType.Base1Error)

class Base2Error() : CustomError(ErrorType.Base2Error)

class Base3Error() : CustomError(ErrorType.Base3Error)

class NotCustomError() : RuntimeException()

fun handlerOf(customError: CustomError): String = when (customError) {
    is Base1Error -> "b1"
    is Base2Error -> "b2"
    is Base3Error -> "b3"
    else -> throw NotCustomError()
}
