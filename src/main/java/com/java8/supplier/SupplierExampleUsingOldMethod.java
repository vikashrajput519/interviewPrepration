package com.java8.supplier;

import java.util.function.Supplier;

public class SupplierExampleUsingOldMethod  implements Supplier<String> {
    @Override
    public String get(){
        return "This is Vikash";
    }
    public static void main(String[] args) {
        SupplierExampleUsingOldMethod supplierExampleUsingOldMethod = new SupplierExampleUsingOldMethod();
        System.out.println(supplierExampleUsingOldMethod.get());
    }
}
