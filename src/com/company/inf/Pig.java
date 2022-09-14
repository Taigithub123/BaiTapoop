package com.company.inf;


class Pig implements Animal {
    int heght;
    int tall;
    public void animalSound() {
        System.out.println("tôi là heo");
    }
    public void sleep() {
        System.out.println("Zzz");
    }
}

class Main {
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}