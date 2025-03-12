package com.java8.supplier;

import java.util.function.Supplier;

public class SupplierExampleUsingLambdaExpression {

    public static void main(String[] args) {
        // Method 1
        Supplier<String> supplier = () -> {
            return "This is Vikash";
        };

        // Method 2 - If we are writing then return key we can not write though return key word is optional
        Supplier<String> supplier1 = () -> "This is Vikash";

        System.out.println(supplier.get());


    }
}
