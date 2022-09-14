package com.company.Static;

public class StaticMethod {
    static String ten = "Đặng Thái Tài";
    static void change(){
         ten="Tai";
    }
    void display(){
        System.out.println(ten);
    }
    public static void main(String[] args) {
        StaticMethod.change();
        StaticMethod staticMethod=new StaticMethod();
        staticMethod.display();
    }
}
