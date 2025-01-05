package com.onejkspark.jetbrain.rsa

import java.security.PrivateKey
import java.security.PublicKey
import java.util.Base64


fun main() {

    val helper = RSAHelper()
    // RSA 키 쌍 생성
    val keyPair = helper.generateRSAKeyPair()
    val publicKey = keyPair.public
    val privateKey = keyPair.private

    // 키를 Base64 형식으로 출력 (저장/전송용)
    val publicKeyBase64 = Base64.getEncoder().encodeToString(publicKey.encoded)
    val privateKeyBase64 = Base64.getEncoder().encodeToString(privateKey.encoded)

    println("Public Key: $publicKeyBase64")
    println("Private Key: $privateKeyBase64")

    // 암호화
    val plainText = "Hello, RSA with Kotlin!"
    val encryptedText = helper.encryptRSA(plainText, publicKey)
    println("Encrypted Text: $encryptedText")

    // 복호화
    val decryptedText = helper.decryptRSA(encryptedText, privateKey)
    println("Decrypted Text: $decryptedText")

    // Base64 키를 다시 키 객체로 변환하여 복호화
    val reconstructedPublicKey: PublicKey = helper.convertToPublicKey(publicKeyBase64)
    val reconstructedPrivateKey: PrivateKey = helper.convertToPrivateKey(privateKeyBase64)

    val reDecryptedText = helper.decryptRSA(encryptedText, reconstructedPrivateKey)
    println("Re-Decrypted Text (with reconstructed keys): $reDecryptedText")
}


