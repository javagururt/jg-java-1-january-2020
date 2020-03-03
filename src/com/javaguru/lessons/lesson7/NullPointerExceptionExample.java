package com.javaguru.lessons.lesson7;

import java.util.Arrays;

class NullPointerExceptionExample {

    public static void main(String[] args) {
        String[] strings = new String[3];
        System.out.println(Arrays.toString(strings));

        String firstElement = strings[0];
        System.out.println(firstElement);
        if (firstElement.startsWith("A")) {
            System.out.println("SUCCESS: A");
        } else {
            System.out.println("FAILED");
        }
    }
}
