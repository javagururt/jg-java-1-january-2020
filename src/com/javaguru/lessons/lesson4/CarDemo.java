package com.javaguru.lessons.lesson4;

class CarDemo {

    public static void main(String[] args) {
        Car firstCar = new Car();
        firstCar.color = Colors.RED;

        Car secondCar = new Car();
        secondCar.color = Colors.BLACK;

        System.out.println(firstCar.color);
        System.out.println(secondCar.color);

    }
}
