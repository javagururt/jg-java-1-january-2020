package com.javaguru.lessons.lesson5;

class LightBulb {

    private boolean lighted;

    void lightOn() {
        lighted = true;
        System.out.println("LIGHT!");
    }

    void lightOff() {
        lighted = false;
        System.out.println("DARKNESS");
    }
}
