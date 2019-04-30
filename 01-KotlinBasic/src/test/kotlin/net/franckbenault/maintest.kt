package net.franckbenault

import org.junit.Test;
import kotlin.test.assertEquals

class MainKotlinTest {

    @Test
    fun testMax() {
        assertEquals(max(5, 9), 9)
    }

    @Test
    fun testMax2() {
        assertEquals(max2(56, 9), 56)
    }
}