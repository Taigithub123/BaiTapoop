package com.company.passmechanism;

public class Passbyreference {
    int data = 50;

    void change(Passbyreference op) {
        op =new Passbyreference();
        op.data = op.data + 100;
    }

    public static void main(String args[]) {
        Passbyreference op = new Passbyreference();
        System.out.println("Trước khi thay đổi: " + op.data);
        op.change(op); // truyền đối tượng
        System.out.println("Sau khi thay đổi: " + op.data);
    }
}
