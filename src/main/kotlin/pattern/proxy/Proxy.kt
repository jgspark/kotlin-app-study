package pattern.proxy

class Proxy : RunService {

    private var service: RunService? = null

    override fun runService(): String {

        println("before method")

        service = RunServiceImpl()

        println("after method")

        return service!!.runService()
    }
}