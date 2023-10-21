package com.onejkspark.ticketsales.domain

// 소극장 클래스
class Theater(
    private val ticketSeller: TicketSeller
) {

    fun enter(audience: Audience) {
        ticketSeller.sellTo(audience)
    }
}
