package com.company.lambda.staticmt;

public class MyClass {
    public static int doFind(String s1, String s2) {
        return s1.lastIndexOf(s2);
    }

    public static void main(String[] args) {
//        Finder finder = (s1,s2)->MyClass.doFind(s1,s2);
//        System.out.println(finder.find("dang thai tai","i"));
        Finder finder = MyClass::doFind;
        System.out.println(finder.find("dang thai tai","i"));
    }
}

