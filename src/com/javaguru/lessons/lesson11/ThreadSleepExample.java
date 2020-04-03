package com.javaguru.lessons.lesson11;

class ThreadSleepExample {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello");
        Thread.sleep(5000); //Do not use
        System.out.println("Home");
    }
}
