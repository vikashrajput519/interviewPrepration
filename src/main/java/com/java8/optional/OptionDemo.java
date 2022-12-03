package com.java8.optional;

import com.java8.sorting.Employee;

import java.util.Optional;

public class OptionDemo {

    public static void main(String[] args) throws Exception {

        Employee employee = new Employee(1, null, 4000.0);
        Employee employeeVikash = new Employee(2, "Vikash", 4000.0);

        // This method will return null since name is null
        /*Optional<String> employeeOptional = Optional.of(employee.getEmployeeName());
        System.out.println(employeeOptional);*/

        // If null then print Optional.empty
        Optional<String> employeeOptional1 = Optional.ofNullable(employee.getEmployeeName());
        System.out.println(employeeOptional1);

        // In this if null then returning some msg
        Optional<String> employeeOptional2 = Optional.ofNullable(employee.getEmployeeName());
        System.out.println(employeeOptional2.orElse("No name present"));

        // We can use other stream api method optional provide us liberty that if we want we
        // can perform some operation or else return some default value
        Optional<String> employeeOptional3 = Optional.ofNullable(employee.getEmployeeName());
        System.out.println(employeeOptional3.map(String::toUpperCase).orElse("No name present"));

        // If some present then changing to Upper case and no value then returning default value
        Optional<String> employeeOptional4 = Optional.ofNullable(employeeVikash.getEmployeeName());
        System.out.println(employeeOptional4.map(String::toUpperCase).orElse("No name present"));
    }
}
