package pattern.builder

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class ComponentTest {


    @Test
    fun `빌더 패턴 테스트 케이스`() {

        val param1Str = "test1"
        val param2Str = "test2"
        val param3Str = "test3"

        val component = Component.Builder()
            .param1(param1Str)
            .param2(param2Str)
            .param3(param3Str)
            .build()

        Assertions.assertEquals(param1Str, component.getParam1())
        Assertions.assertEquals(param2Str, component.getParam2())
        Assertions.assertEquals(param3Str, component.getParam3())
    }


    @Test
    fun `빌더 패턴 일부 null`() {
        val param1Str = "test1"
        val param2Str = "test2"

        val component = Component.Builder()
            .param1(param1Str)
            .param2(param2Str)
            .build()

        Assertions.assertEquals(param1Str, component.getParam1())
        Assertions.assertEquals(param2Str, component.getParam2())
        Assertions.assertNull(component.getParam3())
    }

    @Test
    fun `Other Builder Test`() {
        val param2 = "test"

        val param3 = "test1"

        val value = Component.Param2AndParam3Builder()
            .param2(param2)
            .param3(param3)
            .build()

        Assertions.assertEquals(value.getParam2(), param2)
        Assertions.assertEquals(value.getParam3(), param3)
    }
}