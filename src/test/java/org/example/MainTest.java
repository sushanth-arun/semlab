
package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void test1() {
        assertEquals(24, Main.factorial(4));
    }

    @Test
    public void test2() {
        assertEquals(120, Main.factorial(5));
    }
}
