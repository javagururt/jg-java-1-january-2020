package com.javaguru.lessons.lesson6;

class Tv {

    private static final int MAX_VOLUME = 30;
    private static final int MIN_VOLUME = 0;

    private boolean enabled;
    private int volume;

    void switchTv() {
//        enabled = !enabled;
        if (enabled) {
            enabled = false;
            System.out.println("TV: OFF");
        } else {
            enabled = true;
            System.out.println("TV: ON");
        }
    }

    void increaseVolume() {
        if (enabled && volume < MAX_VOLUME) {
            volume++;
        }
    }

    void decreaseVolume() {
        if (enabled && volume > MIN_VOLUME) {
            volume--;
        }
    }

    public boolean isEnabled() {
        return enabled;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Tv{" +
                "enabled=" + enabled +
                ", volume=" + volume +
                '}';
    }
}
