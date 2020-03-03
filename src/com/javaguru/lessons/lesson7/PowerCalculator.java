package com.javaguru.lessons.lesson7;

class PowerCalculator {

    int power(int number, int power) {
        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= number;
        }
        return result;
    }

}
