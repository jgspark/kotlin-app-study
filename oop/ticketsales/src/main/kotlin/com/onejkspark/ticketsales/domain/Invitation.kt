package com.onejkspark.ticketsales.domain

import java.time.LocalDateTime

/**
 * 초대장 객체
 * - 초대일자를 인스턴스변수로 하는 클래스
 */
class Invitation(
    // 초대일자
    private val whenDate: LocalDateTime
)
