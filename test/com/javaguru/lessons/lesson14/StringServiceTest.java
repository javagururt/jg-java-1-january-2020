package com.javaguru.lessons.lesson14;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class StringServiceTest {

    private StringService victim = new StringService();

    @Test
    public void shouldMapToUpperCase() {
        List<String> inputStrings = Arrays.asList("a", "b", "c", "apple", "mango", "tomato", "orange");
        List<String> expectedStrings = Arrays.asList("A", "B", "C", "APPLE", "MANGO", "TOMATO", "ORANGE");

        List<String> actual = victim.mapToUpperCase(inputStrings);

        assertEquals(expectedStrings, actual);
    }

    @Test
    public void shouldFilterOutIncorrectRangeString() {
        List<String> inputStrings = Arrays.asList("apple", "A", "12", "orange");
        List<String> expectedStrings = Arrays.asList("apple", "orange");

        List<String> actual = victim.filterByLength(inputStrings, 3, 9);

        assertEquals(expectedStrings, actual);
    }

    @Test
    public void shouldCountDuplicates() {
        List<String> inputStrings = Arrays.asList("a", "a", "a", "a", "b", "b", "b", "c");
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 4);
        expected.put("b", 3);
        expected.put("c", 1);

        Map<String, Integer> actual = victim.getDuplicateStringsToCount(inputStrings);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSumAllNumbersInString() {
        String inputString = "aa 1.5 bb 2.5 cc 33.9 dd -1 0.1";
        BigDecimal expected = new BigDecimal("37.00");

        BigDecimal actual = victim.sumAllNumbersInString(inputString);

        assertEquals(expected, actual);
    }
}