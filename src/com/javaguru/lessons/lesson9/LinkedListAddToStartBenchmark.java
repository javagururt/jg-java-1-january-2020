package com.javaguru.lessons.lesson9;

import java.util.LinkedList;
import java.util.List;

class LinkedListAddToStartBenchmark {

    public static void main(String[] args) {
        List<Integer> integers = new LinkedList<>();

        long start = System.currentTimeMillis();

        for (int i = 0; i < 10_000_000; i++) {
            integers.add(0, i);
        }

        long finish = System.currentTimeMillis();
        long result = finish - start;
        System.out.println("Result = " + result + " ms");
    }
}
