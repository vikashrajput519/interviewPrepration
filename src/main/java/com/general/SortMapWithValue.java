package com.general;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
// Documented in word file
public class SortMapWithValue {

    public static void main(String[] args) {

        Map<String, Integer> unSortedMap = new HashMap<>();

        unSortedMap.put("A", 40);
        unSortedMap.put("B", 50);
        unSortedMap.put("C", 30);
        unSortedMap.put("D", 10);
        unSortedMap.put("E", 20);

        unSortedMap = unSortedMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));


        for(Map.Entry<String, Integer> ttt : unSortedMap.entrySet()){
            System.out.println(ttt.getKey() +" -- "+ttt.getValue());
        }


    }
}
