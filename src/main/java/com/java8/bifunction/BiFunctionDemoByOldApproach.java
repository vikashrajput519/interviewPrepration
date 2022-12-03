package com.java8.bifunction;

import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BiFunctionDemoByOldApproach implements BiFunction<List<Integer>, List<Integer>, List<Integer>> {

    @Override
    public List<Integer> apply(List<Integer> list1, List<Integer> list2){
        return Stream.of(list1, list2).flatMap(List::stream).distinct().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> list1 = Stream.of(1, 3, 4, 6, 7, 9, 19).collect(Collectors.toList());
        List<Integer> list2 = Stream.of(11, 3, 43, 6, 7, 19).collect(Collectors.toList());

        BiFunctionDemoByOldApproach biFunctionDemoByOldApproach = new BiFunctionDemoByOldApproach();
        List<Integer> list3 = biFunctionDemoByOldApproach.apply(list1, list2);
        System.out.println(list3);
    }
}
