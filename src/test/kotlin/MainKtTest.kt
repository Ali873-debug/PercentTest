import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MainKtTest {

    @Test
    fun should_returnMinus1_when_ElementsAreNotOnly_aANDb() {
        //Given a list with different String elements
        val testList = listOf<String>("a", "b", "c", "d", "a")
        //when calculate the percent of the char a
        val testPercent = precentChar(testList)
        //then check the result
        assertEquals(-1, testPercent)
    }

    @Test
    fun should_returnPrecentOf_a_when_ElementsAreOnly_aANDb() {
        //Given a list with only "a" and "b" String elements
        val testList = listOf<String>("a", "b", "b", "a")
        //when calculate the percent of the char a
        val testPercent = precentChar(testList)
        //then check the result
        assertEquals(50.0, testPercent)
    }

    @Test
    fun should_returnMinus1_when_ElementsAreNumbers() {
        //Given a list with only "a" and "b" String elements
        val testList = listOf<Any>("a", "b", "b",1 )
        //when calculate the percent of the char a
        val testPercent = precentChar(testList)
        //then check the result
        assertEquals(-1, testPercent)
    }

}
