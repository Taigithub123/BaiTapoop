package com.company.passmechanism;

public class PassbyValue {
    int data = 50;

    void change(int data) {
        data = data + 100;
    }

    public static void main(String args[]) {
        PassbyValue op = new PassbyValue();

        System.out.println("Trước khi thay đổi: " + op.data);
        op.change(500);
        System.out.println("Sau khi thay đổi: " + op.data);
    }
}
