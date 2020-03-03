package com.javaguru.lessons.lesson7;

class CatTest {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Kuzya");
        System.out.println(cat);
        System.out.println();
        changeName(cat);
        System.out.println(cat);
    }

    public static void changeName(Cat passByValue) {
        passByValue.setName("Vasya");
    }
}
