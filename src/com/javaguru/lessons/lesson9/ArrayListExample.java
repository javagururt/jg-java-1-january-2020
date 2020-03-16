package com.javaguru.lessons.lesson9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class ArrayListExample {

    public static void main(String[] args) {
        List<String> strings = new LinkedList<>();
        System.out.println(strings.size());
        System.out.println(strings);

        fillList(strings);
        System.out.println(strings);
        System.out.println("Size = " + strings.size());
    }

    private static void fillList(List<String> strings) {
        for (int i = 0; i < 100; i++) {
            strings.add("A");
        }
    }
}
