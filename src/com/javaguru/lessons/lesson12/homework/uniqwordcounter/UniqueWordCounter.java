package com.javaguru.lessons.lesson12.homework.uniqwordcounter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class UniqueWordCounter {

    //Key - word (String)
    //Value - count (Integer)
    private Map<String, Integer> uniqueWordToCount = new HashMap<>();

    /**
     * добавляет строку и считает количество раз, которое она была добавлена;
     */
    void addWord(String word) {
        if (uniqueWordToCount.containsKey(word)) {
            Integer count = uniqueWordToCount.get(word);
            count++;
            uniqueWordToCount.put(word, count);
        } else {
            uniqueWordToCount.put(word, 1);
        }
    }

    /*
    Entry - Key(String) Value(Integer)
    Key - apple    value - 5
    Key - mango     value - 3

    Values - values (Integer)
    value - 5
    value - 3
     */

    String getMostFrequentWord() {
        String mostFrequentWord = null;
        Integer mostFrequentWordCount = 0;
        for (Map.Entry<String, Integer> entry : uniqueWordToCount.entrySet()) {
            if (entry.getValue() > mostFrequentWordCount) {
                mostFrequentWord = entry.getKey();
                mostFrequentWordCount = entry.getValue();
            }
        }
        return mostFrequentWord;
    }

    List<String> getMostFrequentWords() {
        List<String> mostFrequentWords = new ArrayList<>();
        Integer mostFrequentWordCount = 0;

        //3 3 1
        for (Integer count : uniqueWordToCount.values()) {
            if (count > mostFrequentWordCount) {
                mostFrequentWordCount = count;
            }
        }

        for (Map.Entry<String, Integer> entry : uniqueWordToCount.entrySet()) {
            if (mostFrequentWordCount.equals(entry.getValue())) {
                mostFrequentWords.add(entry.getKey());
            }
        }

        return mostFrequentWords;
    }

    void print() {
        System.out.println(uniqueWordToCount);
    }
}
