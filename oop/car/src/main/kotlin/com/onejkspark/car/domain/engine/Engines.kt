package com.onejkspark.car.domain.engine

class GasolineEngine : Engine {
    override fun turnOn() {
        println("Gasoline Engine turn on")
    }

    override fun turnOff() {
        println("Gasoline Engine turn off")
    }
}

class DieselEngine : Engine {
    override fun turnOn() {
        println("DieselEngine Engine turn on")
    }

    override fun turnOff() {
        println("DieselEngine Engine turn off")
    }
}
