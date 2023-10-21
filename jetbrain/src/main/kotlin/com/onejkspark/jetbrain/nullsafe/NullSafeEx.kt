package com.onejkspark.jetbrain.nullsafe

fun nullSafeByIf(string: String?): String? = string?.let {
    "null"
}

//    .run {
//    "notNull"
// }

fun nullException(string: String) = "test"
