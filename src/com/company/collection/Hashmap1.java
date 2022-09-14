package com.company.collection;

import java.util.HashMap;

public class Hashmap1 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        // add elements to hashMap
        hashMap.put(1, "Java");
        hashMap.put(2, "C++");
        hashMap.put(3, "PHP");
        hashMap.put(4, "Python");
        for (Integer i : hashMap.keySet()) {
            System.out.println(hashMap.get(i));
        }
//        hashMap.clear();
//        System.out.println("clear"+hashMap);
//        hashMap.remove(3);
//        System.out.println("remove"+hashMap);
    }
}
