package com.javaguru.lessons.lesson7;

import java.util.Random;

class ArrayService {

    int[] createArray(int size) {
        return new int[size];
    }

    void fillArrayWithRandomNumbers(int[] array) {
        Random randomGenerator = new Random();
        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = randomGenerator.nextInt(101);
        }
    }
}
