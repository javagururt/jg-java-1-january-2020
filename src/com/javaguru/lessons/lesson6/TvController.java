package com.javaguru.lessons.lesson6;

class TvController {

    private Tv tv;

    public void setTv(Tv tv) {
        this.tv = tv;
    }

    void increaseVolume() {
        if (tv != null) {
            tv.increaseVolume();
        }
    }

    void decreaseVolume() {
        if (tv != null) {
            tv.decreaseVolume();
        }
    }
}
