package com.company.polymorphism.ovl;

public class Main {
    public static void main(String[] args) {
        MySum mySum = new MySum();
        System.out.println("a + b = " + mySum.sum(1, 2));
        System.out.println("a + b + c = " + mySum.sum(1,2,3));
    }
}
