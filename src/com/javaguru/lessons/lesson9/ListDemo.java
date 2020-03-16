package com.javaguru.lessons.lesson9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class ListDemo {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 1_000; i++) {
            integers.add(i);
        }

        List<Integer> integerLinkedList = new LinkedList<>(integers);
        for (int i = 0; i < 1_000; i++) {
            integerLinkedList.add(0, i);
        }


    }
}
