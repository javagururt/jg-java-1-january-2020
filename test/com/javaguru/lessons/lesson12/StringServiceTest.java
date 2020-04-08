package com.javaguru.lessons.lesson12;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

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

        List<String> actual = victim.filterOutOfRange(inputStrings, 3, 9);

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
        String inputString = "aa 1 bb 2 cc 33 dd -1 0";
        Integer expected = 35;

        Integer actual = victim.sumAllNumbersInString(inputString);

        assertEquals(expected, actual);
    }
}