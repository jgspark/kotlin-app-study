package pattern.abstractfactory

class OSFactory {

    companion object {

        fun createdOs(type: OsType): OS =
            when (type) {
                OsType.MAC -> Mac()
                OsType.WINDOW -> Window()
                OsType.LINUX -> Linux()
            }
    }
}