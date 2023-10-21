package com.onejkspark.ticketsales.domain


/*
관람객의 보관할 클래스
 */
class Bag(
    // 현금
    private var amount: Long,
    // 초대장
    private val invitation: Invitation?,
    // 티켓
    private var ticket: Ticket?
) {

    constructor(amount: Long) : this(amount, null, null)

    constructor(invitation: Invitation, amount: Long) : this(amount, invitation, null)

    private fun hasInvitation(): Boolean = invitation != null

    private fun hasTicket(): Boolean = ticket != null

    private fun minusAmount(amount: Long) {
        this.amount -= amount
    }

    private fun plusAmount(amount: Long) {
        this.amount += amount
    }

    private fun setTicket(ticket: Ticket?) {
        this.ticket = ticket
    }

    fun hold(ticket: Ticket): Long {

        setTicket(ticket)

        return if (hasInvitation()) {
            0L
        } else {
            minusAmount(ticket.getFee())
            ticket.getFee()
        }
    }

}
