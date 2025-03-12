package com.java8.predicate;

import java.util.function.Predicate;

public class PredicateExampleUsingOldMethod implements Predicate<Integer> {

    @Override
    public boolean test(Integer integer){
        // Checking given number is Odd/Even
        return integer % 2 == 0 ? Boolean.TRUE : Boolean.FALSE;
    }

    public static void main(String[] args) {
        PredicateExampleUsingOldMethod predicateExampleUsingOldMethod = new PredicateExampleUsingOldMethod();

        System.out.println(predicateExampleUsingOldMethod.test(10));
    }
}
