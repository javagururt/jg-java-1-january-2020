package com.javaguru.lessons.lesson14;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class StringService {

    /**
     * Написать метод, который принимает список строк и каждую строку приводит к верхнему регистру
     */
    List<String> mapToUpperCase(List<String> strings) {
        return strings.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());
    }

    /**
     * Написать метод, который принимает список строк, минимальную длину строки и максимальную длину
     * строки. Отфильтровать список от строк которые не подходят по длине.
     */

    List<String> filterByLength(List<String> strings, int minLength, int maxLength) {
        return strings.stream()
                .filter(s -> s.length() > minLength && s.length() < maxLength)
                .collect(Collectors.toList());
    }

    /**
     * Написать метод, который принимает список строк и подсчитывает количество дубликатов. Метод
     * возвращает Map, в качестве ключа - строка, значение - количество повторов
     */

    Map<String, Integer> getDuplicateStringsToCount(List<String> strings) {
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        for (String string : strings) {
            if (stringIntegerMap.containsKey(string)) {
                Integer count = stringIntegerMap.get(string);
                count++;
                stringIntegerMap.put(string, count);
            } else {
                stringIntegerMap.put(string, 1);
            }
        }
        return stringIntegerMap;
    }

    /**
     * Написать метод, который принимает строку, разбивает строку по словам, отделяет строки
     * (пробел), которые являются числами и возвращает сумму всех (найденных) чисел встроке.
     */
    // input aa 1 bb 2 cc 33 dd -1 0
//    Integer sumAllNumbersInString(String string) {
//        return Stream.of(string.split(" "))
//                .filter(s -> isNumeric(s))
//                .map(s -> Integer.parseInt(s))
//                .reduce(0, (integer, integer2) -> integer + integer2);
//    }

    BigDecimal sumAllNumbersInString(String string) {
        return Stream.of(string.split(" "))
                .filter(s -> isNumeric(s))
                .map(s -> new BigDecimal(s))
                .reduce(BigDecimal.ZERO, (b1, b2) -> b1.add(b2))

                .setScale(2, RoundingMode.HALF_EVEN);


    }

    private boolean isNumeric(String string) {
        try {
            new BigDecimal(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
