package com.company.trycatch;

public class Ngoaile {
    public static void main(String[] args) {
        int[] mang={1,2};
        try {
            System.out.println(mang[3]);
        }catch (Exception e) {
            System.out.println("lỗi");
        }finally {
            System.out.println("finally");
        }
        System.out.println("kết thúc");
    }
}
