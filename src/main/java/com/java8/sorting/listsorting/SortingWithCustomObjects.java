package com.java8.sorting.listsorting;

import com.java8.sorting.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingWithCustomObjects {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "Vikash", 30000.00));
        employeeList.add(new Employee(2, "Sonu", 30000.00));
        employeeList.add(new Employee(3, "Kumar", 10000.00));
        employeeList.add(new Employee(4, "Singh", 50000.00));
        employeeList.add(new Employee(5, "Vikaram", 50000.00));

        // Using Old Method of Java - Ascending
        System.out.println("Using Old Method");
        System.out.println("In Ascending of Java");
        Collections.sort(employeeList, (object1, object2) -> object1.getSalary().compareTo(object2.getSalary()));
        employeeList.stream().forEach(t -> System.out.println(t));

        // Using Old Method of Java - Descending
        System.out.println();
        System.out.println("In Descending of Java");
        Collections.sort(employeeList, (object1, object2) -> - object1.getSalary().compareTo(object2.getSalary()));
        employeeList.stream().forEach(t -> System.out.println(t));

        // By Using Stream API
        System.out.println();
        System.out.println("--------------------------------------------------");
        System.out.println("Using Stream API - Ascending");
        employeeList.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(t -> System.out.println(t));

        System.out.println("Using Stream API - Descending");
        employeeList.stream().sorted(Comparator.comparing(Employee::getSalary, Comparator.reverseOrder())).forEach(t -> System.out.println(t));

        System.out.println();
        System.out.println("----------------------Null handle----------------------------");
        System.out.println("Using Stream API with Null at last - Descending");
        employeeList.add(new Employee(4, "Test", null));
        // If we will not add Comparator.nullsLast(Comparator.reverseOrder()) then we will get null pointer exception
        employeeList.stream().sorted(Comparator.comparing(Employee::getSalary, Comparator.nullsLast(Comparator.reverseOrder()))).forEach(t -> System.out.println(t));

        System.out.println();
        System.out.println("----------------------Then compare----------------------------");
        System.out.println("Using Stream API with Then compare and null at last - Descending");
        employeeList.add(new Employee(4, "Test", null));
        // If we will not add Comparator.nullsLast(Comparator.reverseOrder()) then we will get null pointer exception
        employeeList.stream().sorted(Comparator.comparing(Employee::getSalary, Comparator.nullsLast(Comparator.reverseOrder())).thenComparing(Employee::getEmployeeName, Comparator.nullsLast(Comparator.reverseOrder()))).forEach(t -> System.out.println(t));
    }
}
