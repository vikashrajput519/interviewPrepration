package com.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterDuplicateFromArray {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        Integer[] a = {1, 2, 3, 4, 5, 6, 6, 3, 2, 1};

        List<Integer> arrayList = Arrays.asList(a);

        arrayList = arrayList.stream().filter(e -> !set.add(e)).collect(Collectors.toList());

        System.out.println(arrayList);
    }
}
