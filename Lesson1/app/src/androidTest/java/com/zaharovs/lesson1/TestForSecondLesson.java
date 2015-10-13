package com.zaharovs.lesson1;

import junit.framework.TestCase;


public class TestForSecondLesson extends TestCase {

    public void testFibonacci() throws Exception{
        assertEquals(0, SecondActivity.displayFibonacci(1));
        assertEquals(1, SecondActivity.displayFibonacci(3));
        assertEquals(3, SecondActivity.displayFibonacci(5));
        assertEquals(21, SecondActivity.displayFibonacci(9));
    }

    public void testFactorial() throws Exception{
        assertEquals(1, SecondActivity.displayFactorial(1));
        assertEquals(120, SecondActivity.displayFactorial(5));
        assertEquals(6, SecondActivity.displayFactorial(3));
    }
}
