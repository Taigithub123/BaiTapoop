package com.company.string;

public class Test {
    public static void main(java.lang.String[] args){

        long startTime = System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer("Hello");
        for (int i=0; i<10000000; i++){
            buffer.append("Word");
        }
        System.out.println("StringBuffer is: " + (System.currentTimeMillis() - startTime) + "ms");

        startTime = System.currentTimeMillis();
        StringBuilder buider = new StringBuilder("hello");

            for (int i=0; i<10000000; i++){
                buider.append("Word");

            }



        System.out.println("StringBuilder is: " + (System.currentTimeMillis() - startTime) + "ms");
    }
}
