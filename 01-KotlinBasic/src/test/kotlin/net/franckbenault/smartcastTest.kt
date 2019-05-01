package net.franckbenault

import org.junit.Test;
import kotlin.test.assertEquals

class ExpTest {

    @Test
    fun testSimpleNum() {
        assertEquals(eval(Num(5)), 5)
    }

    @Test
    fun testSimpleSum() {
        assertEquals(eval(Sum(Num(5), Num(1))), 6)
    }

    @Test
    fun testComplexeSum() {
        val sum1 = Sum(Num(1), Num(1))
        val sum2 = Sum(Num(2), Num(2))
        assertEquals(eval(Sum(sum1, sum2)), 6)
    }
}