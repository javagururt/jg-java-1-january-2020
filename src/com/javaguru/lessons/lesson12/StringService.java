package com.javaguru.lessons.lesson12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class StringService {

    /**
     * Написать метод, который принимает список строк и каждую строку приводит к верхнему регистру
     */
    List<String> mapToUpperCase(List<String> strings) {
        List<String> upperCaseStrings = new ArrayList<>();
        for (String string : strings) {
            String upperCaseString = string.toUpperCase();
            upperCaseStrings.add(upperCaseString);
        }
        return upperCaseStrings;
    }

    /**
     * Написать метод, который принимает список строк, минимальную длину строки и максимальную длину
     * строки. Отфильтровать список от строк которые не подходят по длине.
     */

    List<String> filterOutOfRange(List<String> strings, int minLength, int maxLength) {
        List<String> filteredStrings = new ArrayList<>();
        for (String string : strings) {
            if (string.length() > minLength && string.length() < maxLength) {
                filteredStrings.add(string);
            }
        }
        return filteredStrings;
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
    // input aa bb 55 33 aa 22 1 1
    Integer sumAllNumbersInString(String string) {
        String[] strings = string.split(" ");
        int sum = 0;
        for (String str : strings) {
            if (isNumeric(str)) {
                sum += Integer.parseInt(str);
            }
        }

        return sum;
    }

    private boolean isNumeric(String string) {
        try {
            Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
