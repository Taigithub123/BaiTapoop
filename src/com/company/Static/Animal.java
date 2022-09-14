package com.company.Static;

public class Animal {
    //inner class
    class Dog{
        private String ten;
        public void hello(){
            System.out.println("hello");
        }
    }

    public static void main(String[] args) {
        Animal animal=new Animal();
        Animal.Dog d=animal.new Dog();
        d.hello();
    }
}
