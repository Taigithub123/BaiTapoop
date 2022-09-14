package com.company.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class CompareAdd {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        for(int i=0;i<10000000;i++){
            arrayList.add(123);
        }
        int x=500000;
        Long start=System.currentTimeMillis();
        arrayList.get(x);
        System.out.println("ArrayList"+ " " + (System.currentTimeMillis()-start));
        LinkedList<Integer> linkedList=new LinkedList<>();
        for(int i=0;i<10000000;i++){
            linkedList.add(123);
        }
        long start1=System.currentTimeMillis();
        linkedList.get(x);
        System.out.println("linkList"+ " "+(System.currentTimeMillis()-start1));


    }
}
