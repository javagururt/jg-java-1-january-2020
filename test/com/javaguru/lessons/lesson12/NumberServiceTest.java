package com.javaguru.lessons.lesson12;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class NumberServiceTest {

    private NumberService victim = new NumberService();

    @Test
    public void shouldSumAllElements() {
        List<Integer> integers = Arrays.asList(3,4,5,6,7,8);
        Integer expectedResult = 33;

        Integer actual = victim.sumAllElements(integers);

        assertEquals(expectedResult, actual);
    }

}