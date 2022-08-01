package effect.item1

interface EventItem {
    val active: Boolean
}

class ActionEvent(override var active: Boolean) : EventItem {
}

val name: String? = "Marton"

val surname: String? = "Branum"

val fullName: String?
    get() = name?.let {
        "$it $surname"
    }

val fullName2: String? = name?.let {
    "$it $surname"
}


data class User constructor(
    val name: String,
    val surName: String
)