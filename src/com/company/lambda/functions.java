package com.company.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class functions {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("tubean", "JAVA", "demo", "Function");
        Stream<String> stream = list.stream();
        // chuyển tất cả các phần tử của stream thành chữ in hoa
        stream.map(new Function<String, String>()  {
            @Override
            public  String  apply(String t)  {
                return t.toUpperCase();
            }
        }).forEach(t -> System.out.println(t));
    }
}
