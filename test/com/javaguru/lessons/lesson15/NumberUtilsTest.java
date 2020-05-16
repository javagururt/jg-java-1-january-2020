package com.javaguru.lessons.lesson15;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NumberUtilsTest {

    private NumberUtils victim = new NumberUtils();

    @Test
    public void test7isPrimeNumber() {
        boolean actual = victim.isPrime(7);
        assertTrue(actual);
    }

    @Test
    public void shouldReturnFalseWhenNumberIsNotPrime() {
        List<Integer> notPrimeNumbers = Arrays.asList(4, 6, 8, 9, 49, 35, 81);
        for (int number : notPrimeNumbers) {
            boolean actual = victim.isPrime(number);
            assertFalse(actual);
        }
    }

    @Test
    public void shouldReturnTrueWhenNumberIsPrime() {
        List<Integer> notPrimeNumbers = Arrays.asList(2, 3, 5, 7, 13, 11, 19);
        for (int number : notPrimeNumbers) {
            boolean actual = victim.isPrime(number);
            assertTrue(actual);
        }
    }

    @Test
    public void shouldReturnFalseWhenNumberIsNegative() {
        boolean actual = victim.isPrime(-1);
        assertFalse(actual);
    }

    @Test
    public void test1isNotPrimeNumber() {
        boolean actual = victim.isPrime(1);
        assertFalse(actual);
    }
}