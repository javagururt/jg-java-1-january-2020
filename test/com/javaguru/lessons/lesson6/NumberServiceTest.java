package com.javaguru.lessons.lesson6;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberServiceTest {

    private NumberService victim = new NumberService();

    // `should return sum in range 25 from 3 to 7`
    @Test
    public void shouldReturnSum25InRangeFrom3To7() {
        int result = victim.rangeSum(3, 7);
        assertEquals(25, result);
    }

    @Test
    public void shouldReturnSum25InRangeFrom7To3() {
        int result = victim.rangeSum(7, 3);
        assertEquals(25, result);
    }
}