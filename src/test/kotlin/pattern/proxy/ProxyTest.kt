package pattern.proxy

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ProxyTest {


    @Test
    fun `프록시 테스트`() {

        val runService = Proxy()

        val string = runService.runService()

        assertEquals("서비스실행중", string)
    }

}