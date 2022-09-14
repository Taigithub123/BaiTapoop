package com.company.Static;

public class StaticAva {
//    int count = 0; // sẽ lấy bộ nhớ khi instance được tạo ra
    static int count = 0; // sẽ lấy bộ nhớ chỉ một lần
    StaticAva() {
        count++;
        System.out.println(count);
    }

    public static void main(String args[]) {

        StaticAva c1 = new StaticAva();
        StaticAva c2 = new StaticAva();
        StaticAva c3 = new StaticAva();

    }
}
