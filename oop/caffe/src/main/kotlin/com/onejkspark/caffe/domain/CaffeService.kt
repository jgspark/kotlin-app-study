package com.onejkspark.caffe.domain

import com.onejkspark.caffe.domain.barista.Barista
import com.onejkspark.caffe.domain.customer.Customer
import com.onejkspark.caffe.domain.menu.Caffe
import com.onejkspark.caffe.domain.menu.MenuKotlinRepositoryImpl
import com.onejkspark.caffe.domain.menu.MenuRepository
import com.onejkspark.caffe.domain.order.Order

class CaffeService {

    /**
     * 메뉴의 Repository 는 어떤 Infra 에 대해서는 신경 쓰지 말아야 한다.
     * 그렇기 때문에 해당하는 인터페이스를 통해서 필요한 행동만 행위를 한다.
     * 구현체는 Class 에서 구현 ...
     * @see MenuKotlinRepositoryImpl
     */
    private val menuRepository: MenuRepository = MenuKotlinRepositoryImpl()

    /**
     * Caffe 숍에서 주문은 소비자 와 name 으로만 으로 주문을 한다.
     */
    fun order(itemName: String, customer: Customer): Order {
        val menu = menuRepository.getMenu()
        return customer.order(itemName, menu)
    }

    fun make(order: Order, barista: Barista): Caffe {
        // 주문의 상태 변경
        // 만든 상태로 변경
        order.make()
        // 바리스타는 커피를 만든다.
        val coffe = barista.makeCaffe(order.menuItem)
        // 커피가 잘 만들었으면,
        // 주문이 끝난 상태로 변경
        order.end()
        // 변경 되면 커피를 손님에게 준다.
        return coffe
    }
}
