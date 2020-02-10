package com.javaguru.lessons.lesson3;

class HamsterTest {

    public static void main(String[] args) {
        Hamster firstHamster = new Hamster();
        firstHamster.setName("Vasya");
        firstHamster.setAge(1);
        firstHamster.setColor("Brown");
        firstHamster.setBreed("Common Hamster");
        firstHamster.setWeight(100);

        System.out.println("Hamster weight = " + firstHamster.getWeight());

        firstHamster.eat(20.5);
        System.out.println("Hamster weight = " + firstHamster.getWeight());

        firstHamster.eat(30);
        firstHamster.eat(30);
        System.out.println("Hamster weight = " + firstHamster.getWeight() + " kg");
        System.out.println("Hamster name = " + firstHamster.getName());
        System.out.println("Hamster color = " + firstHamster.getColor());
        System.out.println("Hamster breed = " + firstHamster.getBreed());
        System.out.println("Hamster age = " + firstHamster.getAge());
    }
}
