package com.javaguru.lessons.lesson4;

class AquaParkVisitorAgeClassifier {

    public String classify(int age) {
        if (age < 0) {
            return "Incorrect age";
        }
        if (age <= 5) {
            return "Baby";
        }
        if (age <= 10) {
            return "Junior";
        }
        if (age <= 20) {
            return "Teenager";
        }
        if (age <= 30) {
            return "Young";
        }
        if (age <= 60) {
            return "Senior";
        }
        if (age <= 100) {
            return "Granny";
        }
        return "Jedi";
    }
}
