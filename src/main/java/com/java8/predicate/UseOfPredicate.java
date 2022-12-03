package com.java8.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class UseOfPredicate {
    public static void main(String[] args) {

        Predicate<Integer> evenOddPredicate = (integer) -> integer % 2 == 0 ? Boolean.TRUE : Boolean.FALSE;

        List<Integer> listOfInteger = Arrays.asList(1, 2, 3, 4, 5);

        listOfInteger.stream().filter(evenOddPredicate).forEach((t) -> System.out.println(t));
    }
}
