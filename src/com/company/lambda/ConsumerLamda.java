package com.company.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class ConsumerLamda {
    public static void main(String[] args) {
        //example consumer
        Consumer<String> c = (x) -> System.out.println(x.toUpperCase());
        c.accept("Java2s.com");
        //consumer with object
        Consumer<Student> c1 = (x) -> System.out.println("name: " + x.getName() + " age: " + x.getAge());
        List<Student> students = new ArrayList<>();
        students.add(new Student("tai", 12));
        students.add(new Student("hoang", 23));
        students.add(new Student("hoa", 43));
        //forEach with consumer
//        students.forEach(c1);
        //forEach lambda expression
        students.forEach(g -> g.sayHello());
        //method reference
//        students.forEach(Student::sayHello);
        //longconsumer
        LongConsumer lc = longNum -> {
            long cube = longNum * longNum * longNum;
            System.out.println("Cube of " + longNum + " is = " + cube);
        };
        lc.accept(3);
        //intconsumer
        IntConsumer ic = i -> System.out.println("Square of " + i + " is = " + (i * i));
        ic.accept(5);
        //doubleConsumer
        DoubleConsumer dc = d -> System.out.println("Square of " + d + " is \t= " + (d*d));
        dc.accept(5.2);
        dc.accept(9.14);
    }
}
