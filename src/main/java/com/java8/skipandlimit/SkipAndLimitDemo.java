package com.java8.skipandlimit;

import java.util.Arrays;
import java.util.List;

public class SkipAndLimitDemo {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Print 2 to 8
        list.stream().skip(1).limit(7).forEach(t -> System.out.print(t+" "));

        // Print 3 to 9
        System.out.println();
        list.stream().skip(2).limit(7).forEach(t -> System.out.print(t+" "));
    }
}
