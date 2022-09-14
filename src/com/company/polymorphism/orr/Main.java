package com.company.polymorphism.orr;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test dog: ");
        Dog d = new Dog();
        d.eat();
        d.makeSound();
        d.sleep();

        System.out.println("---- ");
        System.out.println("Test cat: ");
        Cat c= new Cat();
        c.eat();
        c.makeSound();
        c.sleep();
    }
}
