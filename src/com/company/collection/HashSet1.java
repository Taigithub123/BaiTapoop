package com.company.collection;

import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
//        System.out.println(cars);
        System.out.println("contains: "+cars.contains("Mazda"));
//        cars.remove("Volvo");
//        System.out.println("remove"+cars);
//        cars.clear();
//        System.out.println("clear"+cars);

    }

}
