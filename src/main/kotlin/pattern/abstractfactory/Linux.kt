package pattern.abstractfactory

class Linux : OS {

    override fun started(): OsType = OsType.LINUX

    override fun end() {
    }
}