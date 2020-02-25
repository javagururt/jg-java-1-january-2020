package com.javaguru.lessons.lesson6;

class TvTest {

    public static void main(String[] args) {
        Tv tv = new Tv();
        System.out.println(tv);

        tv.increaseVolume();
        tv.increaseVolume();
        tv.increaseVolume();

        System.out.println(tv);

        tv.switchTv();
        tv.increaseVolume();
        System.out.println(tv);

        TvController tvController = new TvController();
        tvController.setTv(tv);

        tvController.increaseVolume();
        System.out.println(tv);

        for (int i = 0; i < 1000; i++) {
            tvController.increaseVolume();
        }

        System.out.println(tv);

        tv.switchTv();
        int i = 0;
        while (i < 5) {
            System.out.println("i = " + i);
            tvController.decreaseVolume();
            i++;
        }

        System.out.println(tv);
    }
}
