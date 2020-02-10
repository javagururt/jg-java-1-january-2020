package com.javaguru.lessons.lesson4;

class AquaParkVisitorAgeClassifierTest {

    public static void main(String[] args) {
        AquaParkVisitorAgeClassifierTest testRunner = new AquaParkVisitorAgeClassifierTest();
        testRunner.shouldReturnTitleBabyWhenAge5();
        testRunner.shouldReturnTitleBabyWhenAge0();
        testRunner.shouldReturnTitleJuniorWhenAge10();
        testRunner.shouldReturnTitleJediWhenAge101();
        testRunner.shouldReturnTitleIncorrectAgeWhenAgeNegative();
    }

    public void shouldReturnTitleBabyWhenAge0() {
        AquaParkVisitorAgeClassifier victim = new AquaParkVisitorAgeClassifier();

        int age = 0;
        String expectedResult = "Baby";

        String actualResult = victim.classify(age);

        if (expectedResult.equals(actualResult)) {
            System.out.println("shouldReturnTitleBabyWhenAge0 : SUCCESS");
        } else {
            System.out.println("shouldReturnTitleBabyWhenAge0 : FAILED");
        }
    }

    public void shouldReturnTitleBabyWhenAge5() {
        AquaParkVisitorAgeClassifier victim = new AquaParkVisitorAgeClassifier();

        int age = 5;
        String expectedResult = "Baby";

        String actualResult = victim.classify(age);

        if (expectedResult.equals(actualResult)) {
            System.out.println("shouldReturnTitleBabyWhenAge5 : SUCCESS");
        } else {
            System.out.println("shouldReturnTitleBabyWhenAge5 : FAILED");
        }
    }

    public void shouldReturnTitleJuniorWhenAge10() {
        AquaParkVisitorAgeClassifier victim = new AquaParkVisitorAgeClassifier();

        int age = 10;
        String expectedResult = "Junior";

        String actualResult = victim.classify(age);

        if (expectedResult.equals(actualResult)) {
            System.out.println("shouldReturnTitleJuniorWhenAge10 : SUCCESS");
        } else {
            System.out.println("shouldReturnTitleJuniorWhenAge10 : FAILED, expected " + expectedResult + " but was " + actualResult);
        }
    }

    public void shouldReturnTitleJediWhenAge101() {
        AquaParkVisitorAgeClassifier victim = new AquaParkVisitorAgeClassifier();

        int age = 101;
        String expectedResult = "Jedi";

        String actualResult = victim.classify(age);

        if (expectedResult.equals(actualResult)) {
            System.out.println("shouldReturnTitleJediWhenAge101 : SUCCESS");
        } else {
            System.out.println("shouldReturnTitleJediWhenAge101 : FAILED, expected " + expectedResult + " but was " + actualResult);
        }
    }

    public void shouldReturnTitleIncorrectAgeWhenAgeNegative() {
        AquaParkVisitorAgeClassifier victim = new AquaParkVisitorAgeClassifier();

        int age = -1;
        String expectedResult = "Incorrect age";

        String actualResult = victim.classify(age);

        if (expectedResult.equals(actualResult)) {
            System.out.println("shouldReturnTitleIncorrectAgeWhenAgeNegative : SUCCESS");
        } else {
            System.out.println("shouldReturnTitleIncorrectAgeWhenAgeNegative : FAILED, expected " + expectedResult + " but was " + actualResult);
        }
    }
}
