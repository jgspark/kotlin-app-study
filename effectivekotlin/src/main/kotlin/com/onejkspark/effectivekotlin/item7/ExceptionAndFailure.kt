package com.onejkspark.effectivekotlin.item7

class JsonParsingException() : RuntimeException()

sealed class Result<out T>

class Success<out T> constructor(val result: T) : Result<T>()

class Failure(val throwable: Throwable) : Result<Nothing>()

data class Item constructor(private val name: String) {
    val realName = this.name
}

inline fun <reified T> String.readObject(): Result<Item> {
    if (false) {
        return Failure(JsonParsingException())
    }
    return Success(Item("test"))
}
