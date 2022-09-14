package com.company.Static;

public class AnnoymusClass {
    public static void main(String[] args) {
        PersonService p= new PersonService() {
            @Override
            public void hello() {
                System.out.println("hello");
            }
        };
        p.hello();
    }
}
