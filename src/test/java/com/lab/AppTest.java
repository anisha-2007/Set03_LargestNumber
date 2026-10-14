package com.lab;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testLargestNumber() {
        assertEquals(25, App.largest(10, 25, 15));
    }

    @Test
    public void testNegativeNumbers() {
        assertEquals(-2, App.largest(-5, -2, -8));
    }

    @Test
    public void testEqualNumbers() {
        assertEquals(7, App.largest(7, 7, 3));
    }
}