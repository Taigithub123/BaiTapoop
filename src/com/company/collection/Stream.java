package com.company.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream {
    public static void main(String args[]){
        //map
        List<Integer> list = Arrays.asList(1,2,2,2,2,3,4,5);
        list.stream().distinct().map(i->i*i).forEach(System.out::println);
        System.out.println("---------------------------------");
        //distinct
        List<Integer> list1 = Arrays.asList(1,2,2,2,2,3,4,5);
        list1.stream().distinct().forEach(System.out::println);
        System.out.println("---------------------------------");
        //sort
        List<Integer> list2 = Arrays.asList(4,3,2,1,0,3,4,5);
        list2.stream().sorted().forEach(System.out::println);
        System.out.println("---------------------------------");
        //filter
        List<String> lines = Arrays.asList("spring", "node", "mkyong");
        List<String> result = lines.stream()
                .filter(line -> !"mkyong".equals(line))
                .collect(Collectors.toList());
        result.forEach(System.out::println);
        System.out.println("---------------------------------");
        List<Integer> integerList=Arrays.asList(1,2,3,4);
        Optional<Integer> optionalInteger=integerList.stream().reduce((a,b)->a+b);
        System.out.println("ket qua"+optionalInteger.get());

    }
}
