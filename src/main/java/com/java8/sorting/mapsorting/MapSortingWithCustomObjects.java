package com.java8.sorting.mapsorting;

import com.java8.sorting.Employee;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapSortingWithCustomObjects {

    public static void main(String[] args) {
        Map<Employee, Integer> map = new HashMap<>();
        map.put(new Employee(1, "Vikash", 50000.0), 8);
        map.put(new Employee(2, "Singh", 20000.0), 4);
        map.put(new Employee(3, "Kumar", 30000.0), 10);
        map.put(new Employee(4, "Sonu", 60000.0), 2);
        map.put(new Employee(5, "Sachin", 80000.0), 6);

        // Ascending
        System.out.println("------------Ascending by Key Salary------------");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary))).forEach(t -> System.out.println(t));

        // Descending
        System.out.println();
        System.out.println("------------Descending by Key Salary------------");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary, Comparator.reverseOrder()))).forEach(t -> System.out.println(t));
        // Descending
        System.out.println();
        System.out.println("------------Descending by Key Salary null at Last------------");
        map.put(new Employee(6, "Test", null), 6);
        map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary, Comparator.nullsLast(Comparator.reverseOrder())))).forEach(t -> System.out.println(t));
    }
}
