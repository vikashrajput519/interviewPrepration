package com.java8.predicate;

import java.util.function.Predicate;

public class PredicateExampleUsingLambdaExpression {

    public static void main(String[] args) {
        Predicate<Integer> evenOddPredicate = (integer) -> integer % 2 == 0 ? Boolean.TRUE : Boolean.FALSE;

        System.out.println(evenOddPredicate.test(10));
    }
}
