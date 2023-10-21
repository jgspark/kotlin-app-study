package com.onejkspark.ticketsales.domain

// 관람객클래스
class Audience(
    private val bag: Bag
) {

    fun getBag(): Bag = this.bag

    fun buy(ticket: Ticket): Long = this.bag.hold(ticket)
}
