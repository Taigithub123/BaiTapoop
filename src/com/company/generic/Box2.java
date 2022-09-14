package com.company.generic;

public class Box2<T> {
    private T value;

    public Box2(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }


    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Box2 box2=new Box2<Integer>(12);
        System.out.println(box2.getValue());
        Box2 box21=new Box2<String>("tai");
        System.out.println(box21.getValue());
    }
}
