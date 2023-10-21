package com.onejkspark.pattern.solid

class LSP {

    companion object {

        fun eatToAnimal(animal: Animal) {
            animal.eat()
        }

        fun swimToAnimal(pisces: Pisces) {
            pisces.swim()
        }

        fun soundToAnimal(animal: Mammalia) {
            animal.sound()
        }
    }
}

fun main() {
    LSP.soundToAnimal(Cat())
    LSP.soundToAnimal(Dog())
    LSP.eatToAnimal(Dog())
    LSP.swimToAnimal(Fish())
}

abstract class Animal {
    abstract fun eat()
}

abstract class Mammalia : Animal() {
    abstract fun sound()
}

abstract class Pisces : Animal() {
    abstract fun swim()
}

class Dog : Mammalia() {
    override fun eat() {
        println("먹는다.")
    }

    override fun sound() {
        println("월")
    }
}

class Cat : Mammalia() {

    override fun eat() {
        eat()
    }

    override fun sound() {
        println("야옹")
    }
}

class Fish : Pisces() {

    override fun swim() {
        println("팔닥")
    }

    override fun eat() {
        println("밥을 먹는다.")
    }
}
