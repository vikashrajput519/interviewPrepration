package com.java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachChar {
    public static void main(String[] args) {
        String str = "Vikashh";
        Map<String, Long> countOfEachCharacter = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(countOfEachCharacter);
    }
}
