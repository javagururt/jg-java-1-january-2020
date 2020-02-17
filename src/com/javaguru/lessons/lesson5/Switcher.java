package com.javaguru.lessons.lesson5;

class Switcher {

    private boolean turned; //false
    private LightBulb lightBulb; // null

    void connect(LightBulb bulb) {
        lightBulb = bulb;
    }

//    public void setLightBulb(LightBulb lightBulb) {
//        this.lightBulb = lightBulb;
//    }

    void turnOn() {
        turned = true;
        System.out.println("Switcher turned ON");

        if (lightBulb != null) {
            lightBulb.lightOn();
        }
    }

    void turnOff() {
        turned = false;
        System.out.println("Switcher turned OFF");
        if (lightBulb != null) {
            lightBulb.lightOff();
        }
    }
}
