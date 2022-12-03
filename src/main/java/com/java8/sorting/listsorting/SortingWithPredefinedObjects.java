package com.java8.sorting.listsorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingWithPredefinedObjects {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,40, 20, 30, 50);


        // Ascending order
        System.out.println();
        System.out.println("Ascending order");
        list.stream().sorted().forEach(t -> System.out.print(t + " "));

        // Descending order
        System.out.println();
        System.out.println("Descending order");
        list.stream().sorted(Comparator.reverseOrder()).forEach(t -> System.out.print(t + " "));

        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(50);
        list2.add(30);
        list2.add(null);

        // Descending order with Null as Last
        System.out.println();
        System.out.println("Descending order with Null as Last");
        list2.stream().sorted(Comparator.nullsLast(Comparator.reverseOrder())).forEach(t -> System.out.print(t + " "));

    }
}
