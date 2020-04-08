package com.javaguru.lessons.lesson12.homework.uniqwordcounter;

import java.util.Scanner;

class UniqueWordCounterDemo {

    public static void main(String[] args) {
        UniqueWordCounter counter = new UniqueWordCounter();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Word");
            System.out.println("2. Get most frequent word");
            System.out.println("3. Get most frequent words (list)");
            System.out.println("4. Print");

            String userInput = scanner.nextLine(); //1 2 3
            int number = Integer.parseInt(userInput);
            if (number == 1) {
                System.out.println("Please enter word:");
                String word = scanner.nextLine();
                counter.addWord(word);
            } else if (number == 2) {
                String mostFrequentWord = counter.getMostFrequentWord();
                System.out.println("Most frequent word: " + mostFrequentWord);
            } else if (number == 3) {
                System.out.println(counter.getMostFrequentWords());
            } else if (number == 4) {
                counter.print();
            } else {
                break;
            }
        }
    }
}
