package com.java8.bifunction;

import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BiFunctionDemoByLambdaExpression {

    public static void main(String[] args) {

        // Output - [1, 3, 4, 6, 7, 9, 19, 11, 43]
        List<Integer> listWithData1 = Stream.of(1, 3, 4, 6, 7, 9, 19).collect(Collectors.toList());
        List<Integer> listWithData2 = Stream.of(11, 3, 43, 6, 7, 19).collect(Collectors.toList());

        BiFunction<List<Integer>, List<Integer>, List<Integer>> biFunction = (list1, list2) -> Stream.of(list1, list2).flatMap(List::stream).distinct().collect(Collectors.toList());

        List<Integer> listAfterMerge = biFunction.apply(listWithData1, listWithData2);
        System.out.println(listAfterMerge);

    }
}
