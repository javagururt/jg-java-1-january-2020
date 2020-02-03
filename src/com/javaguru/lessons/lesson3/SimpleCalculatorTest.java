package com.javaguru.lessons.lesson3;

public class SimpleCalculatorTest {

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        double divideResult = calculator.divide(20.5, 2.5);
        System.out.println("Divide result = " + divideResult);
        double sumResult = calculator.sum(15, 3.5);
        System.out.println("Sum result = " + sumResult);

        double first = 4;
        double second = 40;
        double secondSumResult = calculator.sum(first, second);
        System.out.println("Second sum result = " + secondSumResult);

        double multiplyResult = calculator.multiply(10, 10);
        System.out.println("Multiply result = " + multiplyResult);

        double subtractResult = calculator.subtract(25.7, 13.6);
        System.out.println("Subtract result = " + subtractResult);
    }
}
