package com.onejkspark.jetbrain.rsa

fun main() {

    val rsaHelper = RSAHelper()

    // 테스트용 공개키 (외부에서 제공받은 공개키)
    val publicKeyBase64 =
        "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAgX3sDgJVJ1smARx3tX87WWpoTGOYGOUjJxvp0iiaa/nnxNDy8h3Y6AYpvpRv8s6TPdfHFVxuyLC3KHAWL4kA9TiEq3ytqFXNwjjQDOdNpQP1tOelHIjmw9+o44OgkPi8z0f7Uclp1WT7MArWWXqY/OwUO5pK0ldMw85k7QKPHtD3LUF5DVGwjI6UtEHSWdEvOHlx/Dq9aRUpYYVITpjvyUlQZPEFZ486iiKJAormUbKzWSwslCAdE+6bavifLajzmyCNwpBsUNE3c4YBEnuiFuVLgraBtkI6vhay5eVG9RqzJDCEuuJhh4/MepvuCL0tIRR3Ohxz2GO/09QAsJyM6QIDAQAB"

    // 공개키 객체로 변환
    val publicKey = rsaHelper.convertStringToPublicKey(publicKeyBase64)

    // 암호화 테스트
    val plainText = "Hello, World!"
    val encryptedText = rsaHelper.encryptRSA(
        plainText = plainText,
        publicKey = publicKey
    )

    // 결과 확인
    println("암호화된 텍스트: $encryptedText")

    // 테스트: 암호화된 텍스트 크기 확인 (RSA 2048 기준 약 256바이트)
    if (encryptedText.isEmpty()) {
        throw RuntimeException("암호화 실패: 암호화된 텍스트가 비어 있습니다.")
    }

    println("암호화 테스트 통과: 공개키로 정상적으로 암호화가 수행되었습니다.")
    // 복호화 테스트는 외부에서 개인키로 수행해야 함
    println("복호화 테스트는 외부에서 수행해야 합니다 (개인키 필요).")
}
