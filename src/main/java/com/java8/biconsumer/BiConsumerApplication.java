package com.java8.biconsumer;

import java.util.HashMap;
import java.util.Map;

public class BiConsumerApplication {

    public static void main(String[] args) {
        Map<String, Integer> map=new HashMap<>();
        map.put("basant",5000);
        map.put("santosh",15000);
        map.put("javed",12000);

        map.forEach((k,v)-> System.out.println(k+","+v));
    }
}
