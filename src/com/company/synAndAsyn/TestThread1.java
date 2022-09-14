package com.company.synAndAsyn;

public class TestThread1 {
    //bất đồng bộ
    public static void main(String[] args) {
        count c = new count();
        // Tạo 2 thread truy cập vào cùng tài nguyên trong 1 đối tượng
        Thread t1 = new Thread(new Access("Thread 1", c));
        Thread t2 = new Thread(new Access("Thread 2", c));
        t1.start();
        t2.start();
    }
}

class count {
    int value = 10;
    synchronized static void method1(String name, count c) {
        for (int i = 0; i < 3; i++) {
            System.out.println(name + " " + "index " + i + " before: " + c.value);
            c.value--;
            System.out.println(name + " " + "index " + i + " after: " + c.value);
        }
    }
}
class Access implements Runnable {
    String name;
    count c;
    public Access(String name, count c) {
        this.name = name;
        this.c = c;
    }
    public void run() {
        count.method1(name,c);
//        synchronized (this) {
////        synchronized static void method1(String name, count c) {
//            for (int i = 0; i < 3; i++) {
//                System.out.println(name + " " + "index " + i + " before: " + c.value);
//                c.value--;
//                System.out.println(name + " " + "index " + i + " after: " + c.value);
//            }
//        }
////            }
//        }
    }
}
