package com.javaguru.lessons.lesson12;

import java.util.List;

class NumberService {


    /**
     * Написать метод, который принимает список чисел (int), посчитать сумму всех элементов.
     */

    Integer sumAllElements(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }
}
