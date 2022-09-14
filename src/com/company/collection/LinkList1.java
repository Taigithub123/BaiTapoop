package com.company.collection;

import java.util.LinkedList;

public class LinkList1 {
    public static void main(String[] args) {
        // khai báo 1 LinkedList có tên là list
        // có kiểu là String
        LinkedList<String> list = new LinkedList<String>();
        // Add objects to list
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Java");
        System.out.println("before: "+list);
        //add phần tử theo vị trí
        list.add(2, "C#");
        System.out.println("after: "+list);
        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("Python");
        linkedList.add("Plutter");
        //add collection
        list.addAll(linkedList);
        System.out.println("addAll: "+list);
        //add phần tử vào đầu danh sách
        list.addFirst("Reactjs");
        System.out.println("addFirst: "+list);
        //add phần từ vào cuối danh sách
        list.addLast("React hook");
        System.out.println("addHook: "+list);
//        //delete all element
//        list.clear();
//        System.out.println("Clear: "+list);
        //clone
//        LinkedList<String> list1=new LinkedList<>();
//        list1 =(LinkedList)list.clone();
//        System.out.println("clone: "+list1);
        //
    }
}
