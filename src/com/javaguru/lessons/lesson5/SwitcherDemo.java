package com.javaguru.lessons.lesson5;

class SwitcherDemo {

    public static void main(String[] args) {
        Switcher switcher = new Switcher();
        LightBulb bulb = new LightBulb();

        switcher.turnOn();
        switcher.turnOff();

        switcher.connect(bulb);

        switcher.turnOn();
        switcher.turnOff();
    }
}
