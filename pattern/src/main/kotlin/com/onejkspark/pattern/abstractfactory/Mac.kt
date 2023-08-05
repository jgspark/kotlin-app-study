package com.onejkspark.pattern.abstractfactory

class Mac : OS {

    override fun started() = OsType.MAC

    override fun end() {
        println("맥 OS 종료")
    }
}
