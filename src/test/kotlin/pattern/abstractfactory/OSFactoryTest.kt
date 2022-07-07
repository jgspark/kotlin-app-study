package pattern.abstractfactory

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class OSFactoryTest {

    private var os: OS? = null

    @Test
    fun `맥 운영체제 만들기`() {
        os = OSFactory.createdOs(OsType.MAC)
        assertEquals(os?.started(), OsType.MAC)
    }

    @Test
    fun `윈도우 운영체제 만들기`() {
        os = OSFactory.createdOs(OsType.WINDOW)
        assertEquals(os?.started(), OsType.WINDOW)
    }

    @Test
    fun `리눅스 운영체제 만들기`() {
        os = OSFactory.createdOs(OsType.LINUX)
        assertEquals(os?.started(), OsType.LINUX)
    }
}