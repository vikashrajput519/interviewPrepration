package com.java8.supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class UseOfSupplier {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Vikash");
        list.add("Singh");

        Supplier<String> supplier = () -> "This is first way";

        // If Kumar not found then print suplier msg
        System.out.println(list.stream().filter( string -> string.equals("Kumar")).findFirst().orElseGet(supplier));

        //If found then pring what ever found
        System.out.println(list.stream().filter( string -> string.equals("Vikash")).findFirst().orElseGet(supplier));

        list.clear();
        // Since I have clear the list supplier msg will print and purpose of this code to show we can directly use supplier in here
        System.out.println(list.stream().findAny().orElseGet(() -> "This is Second way"));
    }
}
