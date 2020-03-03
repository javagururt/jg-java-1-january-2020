package com.javaguru.lessons.lesson7;

import java.util.Arrays;

class ArrayServiceTest {

    public static void main(String[] args) {

        ArrayService service = new ArrayService();
        int[] numbers = service.createArray(10);

        System.out.println(Arrays.toString(numbers));

        service.fillArrayWithRandomNumbers(numbers);

        System.out.println(Arrays.toString(numbers));

    }
}
