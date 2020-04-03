package com.javaguru.lessons.lesson11;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator victim = new Calculator();

    @Test
    public void shouldCalculateSum() {
        int result = victim.sum(20, 50);
        assertEquals(70, result);
    }

    @Test
    public void shouldSubtract() {
        int result = victim.subtract(10, 15);
        assertEquals(-5, result);
    }

    @Test
    public void shouldDivide() {
        double result = victim.divide(10, 3);
        assertEquals(3.33333, result, 0.00001);
    }
}