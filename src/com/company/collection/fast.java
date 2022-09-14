package com.company.collection;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

public class fast {
    public static void main(String[] args) {
        hashSet();
        hashMap();
    }

    private static void hashSet() {
        long timeStart = new Date().getTime();
        System.out.println("start1 " + timeStart);
        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < 10000000; i++) {
            hashSet.add("Items " + i);
        }
        long timeEnd = new Date().getTime();
        System.out.println("End1 " + timeEnd);
        System.out.println("Time1 " + (timeEnd - timeStart));
    }

    private static void hashMap() {
        long timeStart = new Date().getTime();
        System.out.println("start2 " + timeStart);
        HashMap<Integer, String> hashMap = new HashMap<>();
        for (int i = 0; i < 10000000; i++) {
            hashMap.put(i, "Items");
        }
        long timeEnd = new Date().getTime();
        System.out.println("End2 " + timeEnd);
        System.out.println("Time2 " + (timeEnd - timeStart));
    }
}
