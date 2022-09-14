package com.company.abs;

public abstract class Person {
    private String ten;
    private int age;

    public abstract double hocphi();

    public Person(String ten, int age) {
        this.ten = ten;
        this.age = age;
    }

    public Person() {
    }

    ;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
