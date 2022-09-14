package com.company.collection;

import java.util.ArrayList;

import static java.util.Collections.addAll;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> alist = new ArrayList<>();
        alist.add("Gregor Clegane");
        alist.add("Khal Drogo");
        alist.add("Cersei Lannister");
        alist.add("Sandor Clegane");
        alist.add("Tyrion Lannister");
        //add(int index, Object element)
        alist.add(2,"sdfsdf");
        System.out.println("before: "+alist);
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("tai123");
        arrayList.add("tai1");
        //addAll(collection c)
        alist.addAll(arrayList);
        System.out.println("after: "+alist);
        //add collection with index
        alist.addAll(3,  arrayList);
        System.out.println("add collection with index: "+alist);
        //shadow copy
//        ArrayList sec_list = new ArrayList();
//        sec_list = (ArrayList)alist.clone();
//        System.out.println("clone: "+sec_list);
        //remove element
        alist.remove("tai1");
        System.out.println("remove: "+alist);
        //remove vị trí
        alist.remove(1);
        System.out.println("remove: "+ alist);
//        //xóa hết phần tử
//        alist.clear();
//        System.out.println("clear: " + alist);
        //trả về số phần tử
        System.out.println("size: "+alist.size());
        //removeAll collection khác
        alist.removeAll(arrayList);
        System.out.println("removeAll: "+alist);
    }
}
