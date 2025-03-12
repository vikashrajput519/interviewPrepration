package com.java8.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class UseOfConsumer {

    public static void main(String[] args) {

        List<Integer> listOfInteger = Arrays.asList(1, 2, 3, 4, 5);

        Consumer<Integer> consumer = (number) -> System.out.println("The Number = "+number);

        listOfInteger.stream().forEach(consumer);
        // Or - In place of consumer we can direct write whole consumer function lambda expression in same foreach
        //listOfInteger.stream().forEach((number) -> System.out.println("The Number = "+number));
    }
}
