package com.java8.sorting.mapsorting;

import java.util.*;

public class MapSortingWithPredefinedObjects {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("eight", 8);
        map.put("four", 4);
        map.put("ten", 10);
        map.put("two", 2);
        map.put("six", 6);

        // Sort by Key - Sorting Map by Using old approach
        System.out.println("-----------Sort by Key - Sorting Map by Using old approach-----------");
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });

        for(Map.Entry<String, Integer> entry : entries){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        System.out.println("-----------Sort by Value - Sorting Map by Using old approach-----------");
        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        for(Map.Entry<String, Integer> entry : entries){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        System.out.println("-----------Sort by Value Ascending- Sorting Map by Using Lambda Expression-----------");
        Collections.sort(entries, (object1, object2) -> object1.getValue().compareTo(object2.getValue()));

        for(Map.Entry<String, Integer> entry : entries){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        // ------------------- Lambda Expression --------------------------------------------------------------------
        System.out.println("-----------Sort by Value Descending - Sorting Map by Using Lambda Expression-----------");
        Collections.sort(entries, (object1, object2) -> - object1.getValue().compareTo(object2.getValue()));

        for(Map.Entry<String, Integer> entry : entries){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        /* ------------------- Using Java8 Stream API -----------------------------------------------------------*/
        System.out.println("---------------------Using Java8 Stream API - Ascending By Key---------------------");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(t -> System.out.println(t));

        System.out.println("---------------------Using Java8 Stream API - Ascending By Value---------------------");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(t -> System.out.println(t));

        System.out.println("---------------------Using Java8 Stream API - Descending By Value---------------------");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(t -> System.out.println(t));

        System.out.println("---------------------Using Java8 Stream API - Descending By Value null at last---------------------");
        map.put("three", null);
        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.nullsLast(Comparator.reverseOrder()))).forEach(t -> System.out.println(t));
    }
}
