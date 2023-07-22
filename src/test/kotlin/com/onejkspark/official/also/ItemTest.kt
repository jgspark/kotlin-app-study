package com.onejkspark.official.also

import com.onejkspark.official.also.Item
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class ItemTest {

    @Test
    fun `java 와 다른 개념 also - 파라미터로 사용`() {

        val mockName = "이름데이터입니다."

        // also 사용법
        // 명시적으로 객체에게 바로 파라미터 데이터 전달
        // also 에서 it은 this 와 유사하며 선호된 객체를 참조하게 된다.
        // 블록 안에서 메소드를 실행을 하게 되면 자기참조가 리턴하게 된다.
        var entity = Item().also {
            it.setName(mockName)
        }

        Assertions.assertEquals(mockName, entity.getName())
    }

    @Test
    fun `java 와 다른 개념 also - 생성자 주입으로 인해서 데이터 뽑기`() {

        val mockName = "이름데이터입니다."

        // also 의 경우 it 을 넘겨 주기도 하나 return 되는 값의 경우
        // 객체가 되게 된다.
        val entity = Item(mockName).also {
            it.getName()
        }

        Assertions.assertEquals(mockName, entity.getName())
    }

    @Test
    fun `java 와 다른 개념 apply`() {

        val mockName = "이름데이터입니다."

        // also 와 다른점은 also 의 경우 블록 안에서 lt로 참조하게 되며
        // apply 의 경우 블록 안에서 this 를 가지고 set 메소드를 통해서
        // 데이터를 가지게 된다.
        val entity = Item().apply {
            setName(mockName)
        }

        Assertions.assertEquals(mockName, entity.getName())
    }

    @Test
    fun `java 와 다른 개념 with`() {

        val mockName = "이름데이터입니다."

        val item = Item()
            .apply {
                setName(mockName)
            }

        val entityName = with(item) {
            // 블록 안에서 this 로 참조를 하기 때문에
            // 바로 변수를 참조안하게 된다.
            getName()
        }

        Assertions.assertEquals(mockName, entityName)

    }

    @Test
    fun `java 와 다른 개념 let`() {

        val mockName = "이름데이터입니다."

        val entityName = Item()
            .apply {
                setName(mockName)
            }
            .let { it ->
                it.getName()
            }

        Assertions.assertEquals(mockName, entityName)
    }

    @Test
    fun `java 와 다른 개념 run`() {

        val mockName = "이름데이터입니다."

        val entityName = Item()
            // apply 로 통해서 item 객체에 name 값을 참조 해준다.
            .apply {
                setName(mockName)
            }
            // 후에 run 을 통해서 name 데이터만 return 해준다.
            .run {
                getName()
            }

        Assertions.assertEquals(mockName, entityName)
    }
}
