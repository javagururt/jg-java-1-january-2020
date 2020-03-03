package com.javaguru.lessons.lesson7;

class ArrayIndexOutOfBoundsException {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        numbers[10] = 123;
    }
}
