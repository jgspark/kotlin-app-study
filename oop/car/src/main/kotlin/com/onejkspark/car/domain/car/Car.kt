package com.onejkspark.car.domain.car

import com.onejkspark.car.domain.engine.Engine

abstract class Car(
    // 자동차의 엔진은 어떤 엔진을 쓰는지 상관이 없다.
    // 엔진만 안다. (SOLID 원칙의 리스코프 치환 원칙)
    protected val engine: Engine,
    protected val model: String,
    protected val year: Int
) {

    abstract fun start()

    abstract fun stop()
}
