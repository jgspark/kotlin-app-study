package com.onejkspark.car

import com.onejkspark.car.domain.Driver
import com.onejkspark.car.domain.car.SportsCar
import com.onejkspark.car.domain.car.Suv
import com.onejkspark.car.domain.engine.DieselEngine
import com.onejkspark.car.domain.engine.GasolineEngine

fun main(args: Array<String>) {

    val gasolineEngine = GasolineEngine()

    val dieselEngine = DieselEngine()

    val suv = Suv(gasolineEngine, "Jeep Car", 2022, 19)

    val sportsCar = SportsCar(dieselEngine, "Porshe 911", 2022, 200)

    val driver1 = Driver(suv)
    driver1.startCar()
    driver1.stopCar()

    val driver2 = Driver(sportsCar)
    driver2.startCar()
    driver2.stopCar()
}
