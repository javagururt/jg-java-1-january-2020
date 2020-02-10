package com.javaguru.lessons.lesson4;

import java.util.Scanner;

class AquaParkVisitorAgeClassifierDemo {

    public static void main(String[] args) {
        AquaParkVisitorAgeClassifier classifier = new AquaParkVisitorAgeClassifier();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();
        String title = classifier.classify(age);
        System.out.println("Your title is " + title);
    }
}
