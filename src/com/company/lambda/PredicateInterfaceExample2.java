package com.company.lambda;

import java.util.Arrays;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

public class PredicateInterfaceExample2 {
    public static void main(String[] args) {
        Predicate<Integer> greaterThanTen = (i) -> i > 10;
        Predicate<Integer> lessThanTwenty = (i) -> i < 20;
        // and
        boolean result = greaterThanTen.and(lessThanTwenty).test(15);
        System.out.println(result); // true
        // or
        boolean result1 = greaterThanTen.or(lessThanTwenty).test(149);
        System.out.println(result1); // true
        // negate
        boolean result2 = greaterThanTen.and(lessThanTwenty).negate().test(15);
        System.out.println(result2); // false
        System.out.println("----------------------------------");
        //predicate with primitive
        System.out.print("IntPredicate: ");
        int[] intNumbers = {3, 5, 6, 2, 1};
        IntPredicate intPredicate = i -> i > 5;
        Arrays.stream(intNumbers).filter(intPredicate).forEach(System.out::println);

        System.out.print("\nLongPredicate: ");
        long[] longNumbers = {3, 5, 6, 2, 1};
        LongPredicate longPredicate = l -> l > 5;
        Arrays.stream(longNumbers).filter(longPredicate).forEach(System.out::println);

        System.out.print("\nDoublePredicate: ");
        double[] dbNumbers = {3.2, 5.0, 6.3, 2.5, 1.0};
        DoublePredicate dbPredicate = d -> d > 5;
        Arrays.stream(dbNumbers).filter(dbPredicate).forEach(System.out::println);
    }
}
