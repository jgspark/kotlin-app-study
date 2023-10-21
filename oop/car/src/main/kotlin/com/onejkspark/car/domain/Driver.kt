package com.onejkspark.car.domain

import com.onejkspark.car.domain.car.Car

/**
 * 드라이버는 어떤 자동자를 타는지 모른다.
 * 그냥 자동차만 탄다.
 * OOP 캡슐화, 단일 책임 자동차만 사용할 꺼야!!
 */
class Driver constructor(private val car: Car) {

    fun startCar() {
        car.start()
    }

    fun stopCar() {
        car.stop()
    }
}
