package baseaction

import basic.classes.Base1Error

class Action {

    fun action1() {
        // throw CustomError()
        throw Base1Error()
    }
}