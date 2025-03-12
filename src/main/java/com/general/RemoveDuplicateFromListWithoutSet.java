package com.general;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
// Documented in word file
public class RemoveDuplicateFromListWithoutSet {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 5, 6, 3, 1, 7);

        System.out.println("Before - " +integerList);


        System.out.println("After - "+ integerList.stream().distinct().collect(Collectors.toList()));
    }
}
