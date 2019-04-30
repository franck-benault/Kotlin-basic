package net.franckbenault;

import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testMax() {
        assertEquals(MainKt.max(5, 9), 9);
    }

    @Test
    public void testMax2() {
        assertEquals(MainKt.max2(56, 9), 56);
    }
}
