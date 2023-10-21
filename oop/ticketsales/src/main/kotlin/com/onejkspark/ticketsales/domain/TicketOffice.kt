package com.onejkspark.ticketsales.domain

// 매표소 클래스
class TicketOffice(private var amount: Long, vararg tickets: Ticket) {

    private val tickets: MutableList<Ticket> = mutableListOf()

    init {
        this.amount += amount
        this.tickets.addAll(tickets)
    }

    private fun getTicket(): Ticket = this.tickets.removeAt(0)

    fun minusAmount(amount: Long) {
        this.amount -= amount
    }

    private fun plusAmount(amount: Long) {
        this.amount += amount
    }

    fun sellTicketTo(audience: Audience) {
        plusAmount(audience.buy(getTicket()))
    }
}
