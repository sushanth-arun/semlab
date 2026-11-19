package org.example;
import java.util.*;
import org.junit.Test;
import org.junit.Assert.assertEquals;

import static org.example.Main.main;

public class MainTest {
    @Test
    public static void test1(){
        assertEquals(24, main(4));
    }
    public static void test2(){
        assertEquals(120, main(5));
    }
}
