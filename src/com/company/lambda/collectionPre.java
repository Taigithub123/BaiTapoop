package com.company.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class collectionPre {
    public static Predicate<Student> isAdultMale() {
        return p -> p.getAge() > 21;
    }

    public static Predicate<Student> isAdultFemale() {
        return p -> p.getAge() > 18;
    }

    public static List<Student> filterStudents(List<Student> Students, Predicate<Student> predicate) {
        return Students.stream().filter(predicate).collect(Collectors.<Student>toList());
    }

    public static void main(String[] args) {

        List<Student> Students = Arrays.asList(
                new Student("tai", 23),
                new Student("hoa", 13),
                new Student("dai", 43)

        );

        // Lấy danh sách Student nam 21+
        System.out.println(filterStudents(Students, isAdultMale()));

        // Lấy danh sách Student nữ 18+
        System.out.println(filterStudents(Students, isAdultFemale()));

    }
}
