package com.java8.bifunction;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class ApplicationOfBiFunction {

    public static void main(String[] args) {

        Map<String, Integer> map=new HashMap<>();
        map.put("basant",5000);
        map.put("santosh",15000);
        map.put("javed",12000);

        System.out.println("Before: "+map);
        BiFunction<String, Integer, Integer> salaryIncremental = (key, value) -> value + 500;
        map.replaceAll(salaryIncremental);

        System.out.println("After: "+map);

        // We can directly use lambda expression inside replaceAll method

        System.out.println("Before adding 1000: "+map);
        map.replaceAll((key, value) -> value + 1000);
        System.out.println("After adding 1000: "+map);
    }
}
