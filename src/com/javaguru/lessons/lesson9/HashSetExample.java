package com.javaguru.lessons.lesson9;

import java.util.HashSet;
import java.util.Set;

class HashSetExample {

    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();
        strings.add("C");
        strings.add("B");
        strings.add("A");
        strings.add("C");
        strings.add("D");
        strings.add("D");
        strings.add("B");

        System.out.println(strings);
    }
}
