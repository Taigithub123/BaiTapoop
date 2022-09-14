package com.company.string;

public class Main {
    public static void main(String[] args) {
        String s="hello";
        s.concat("word");
        System.out.println(s);
        StringBuffer stringBuffer=new StringBuffer("hello");
        stringBuffer.append("word");
        System.out.println(stringBuffer);
    }
}
