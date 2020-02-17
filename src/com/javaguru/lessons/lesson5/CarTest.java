package com.javaguru.lessons.lesson5;

class CarTest {

    public static void main(String[] args) {
        Car car1 = new Car("BMW", "Red");
        Car car2 = new Car(car1.getBrand(), car1.getColor());

        if (car1.equals(car2)) {
            System.out.println("EQUALS");
        } else {
            System.out.println("NOT EQUALS");
        }

        car1 = new Car("BMW", "Black");
        System.out.println(car1);
    }
}
