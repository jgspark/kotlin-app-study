package com.onejkspark.ticketsales.domain

// 판매원 클래스
class TicketSeller(
    private val ticketOffice: TicketOffice
) {

    fun getTicketOffice(): TicketOffice = this.ticketOffice

    fun sellTo(audience: Audience) {
        ticketOffice.sellTicketTo(audience)
    }
}
