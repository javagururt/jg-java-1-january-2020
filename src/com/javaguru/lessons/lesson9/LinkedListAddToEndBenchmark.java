package com.javaguru.lessons.lesson9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class LinkedListAddToEndBenchmark {

    public static void main(String[] args) {
        List<Integer> integers = new LinkedList<>();

        long start = System.currentTimeMillis();

        for (int i = 0; i < 10_000_000; i++) {
            integers.add(i);
        }

        long finish = System.currentTimeMillis();
        long result = finish - start;
        System.out.println("Result = " + result + " ms");
    }
}
