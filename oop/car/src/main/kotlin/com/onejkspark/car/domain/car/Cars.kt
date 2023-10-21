package com.onejkspark.car.domain.car

import com.onejkspark.car.domain.engine.Engine

class Suv(
    engine: Engine,
    model: String,
    year: Int,
    private val numberOfSeats: Int
) : Car(engine, model, year) {

    override fun start() {
        println("starting $model suv with $numberOfSeats seats")
        engine.turnOff()
    }

    override fun stop() {
        println("stopping $model suv with $numberOfSeats seats")
        engine.turnOff()
    }
}

class SportsCar(
    engine: Engine,
    model: String,
    year: Int,
    private val topSpeed: Int
) : Car(engine, model, year) {


    override fun start() {
        println("starting $model sports car with $topSpeed topSpeed")
        engine.turnOn()
    }

    override fun stop() {
        println("stopping $model sports car with $topSpeed topSpeed")
        engine.turnOff()
    }

}
