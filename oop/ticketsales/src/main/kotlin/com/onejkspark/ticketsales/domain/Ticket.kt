package com.onejkspark.ticketsales.domain

/**
 * 공연 관람을 위한 티켓 클래스
 */
class Ticket(
    // 가격
    private val fee: Long
) {

    fun getFee() = fee
}
