package com.company.Static;

import javafx.concurrent.Worker;
//local method class
public class Employee {
    public void Luong() {
        class Work {
            private String ten;
            public void Luong() {
                System.out.println("Luong cong nhan");
            }

        }
        Work w=new Work();
        w.Luong();

    }

    public static void main(String[] args) {
        Employee em=new Employee();
        em.Luong();
    }
}
