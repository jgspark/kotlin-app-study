package com.onejkspark.jetbrain.rsa

import java.security.PublicKey
import java.util.Base64

/**
 * 동일키 검증
 */
fun main() {
    val publicKeyString =
        "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAgX3sDgJVJ1smARx3tX87WWpoTGOYGOUjJxvp0iiaa/nnxNDy8h3Y6AYpvpRv8s6TPdfHFVxuyLC3KHAWL4kA9TiEq3ytqFXNwjjQDOdNpQP1tOelHIjmw9+o44OgkPi8z0f7Uclp1WT7MArWWXqY/OwUO5pK0ldMw85k7QKPHtD3LUF5DVGwjI6UtEHSWdEvOHlx/Dq9aRUpYYVITpjvyUlQZPEFZ486iiKJAormUbKzWSwslCAdE+6bavifLajzmyCNwpBsUNE3c4YBEnuiFuVLgraBtkI6vhay5eVG9RqzJDCEuuJhh4/MepvuCL0tIRR3Ohxz2GO/09QAsJyM6QIDAQAB"
    val rsaHelper = RSAHelper()
    val publicKey: PublicKey = rsaHelper.convertToPublicKey(publicKeyString)
    val publicKeyBase64 = Base64.getEncoder().encodeToString(publicKey.encoded)
    if (publicKeyBase64 != publicKeyString) {
        throw RuntimeException("동일한 key 값이 아닙니다.")
    } else {
        println("동일한 key 값입니다.")
    }
}
