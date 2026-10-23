
package com.example.maven_github_demo7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testEvenNumber() {
        assertEquals("Even", EvenOddChecker.checkEvenOdd(8));
    }

    @Test
    public void testOddNumber() {
        assertEquals("Odd", EvenOddChecker.checkEvenOdd(7));
    }

    @Test
    public void testZero() {
        assertEquals("Even", EvenOddChecker.checkEvenOdd(0));
    }

    @Test
    public void testNegativeEvenNumber() {
        assertEquals("Even", EvenOddChecker.checkEvenOdd(-4));
    }

    @Test
    public void testNegativeOddNumber() {
        assertEquals("Odd", EvenOddChecker.checkEvenOdd(-3));
    }
}
