package com.javaguru.lessons.lesson6;

class NumberServiceDemo {

    public static void main(String[] args) {
        NumberService numberService = new NumberService();
        int sumResult = numberService.rangeSum(3, 7);
        System.out.println("Sum result = " + sumResult);
    }
}
