package com.askedInInterview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupAllElementBasedOnTypeFromAList {
    public static void main(String[] args) {
        // Q1. Benefits of Functional Programming?
        //  Answer - The basic objective of this style of programming is to make code more concise, less complex,
        //  more predictable, and easier to test compared to the legacy style of coding.
        // Java 8 promotes pure function programming which means

        // Group all the elements based on the datatype using Java 8 Stream
        List<Object> list = Arrays.asList(23, 45, 67, 33, 44, 55, 66, 12, 12, 34, 34, 44, 55, 66, 77, 34, 90, 45, 23, 16, 23, 23, 45, 45, 44, 55, 66, 89, 90, 45,
                'a', 'r', 'v', 'f', 'g', 'y', 'v', 'b', 'h', 'j', 'A', 'D', 'F', 'G', 'E', 'E', 12.4, 14.5, 12.34, 45.6, 56.8, 34.5);

        Map<String, List<Object>> finalOutput = list.stream().collect(Collectors.groupingBy(t -> chk(t)));

        finalOutput.forEach((p, k) -> System.out.println(p + " -- " + k));
    }

    private static String chk(Object object) {

        if (object instanceof Integer) {
            return "Integer";
        } else if (object instanceof Character) {
            Character character = (Character) object;
            if (character >= 'a' && character <= 'z') {
                return "Small Character";
            } else if (character >= 'A' && character <= 'Z') {
                return "Capital Character";
            } else {
                return "Character";
            }
        } else if (object instanceof Float) {
            return "Float";
        } else if (object instanceof Double) {
            return "Double";
        } else {
            return "";
        }
    }
}
