package com.java8.parallelstream;

import com.java8.sorting.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        long start = 0;
        long end = 0;

        // Printing 1 to 100 using sequential stream
        start = System.currentTimeMillis();
        IntStream.range(1, 100).forEach(x -> {
            System.out.print(x + " ");
        });
        end = System.currentTimeMillis();

        System.out.println();
        System.out.println("Total time taken to print 1 to 100 by sequential stream = "+(end - start));

        // Printing 1 to 100 using parallel stream
        start = System.currentTimeMillis();
        System.out.println();
        IntStream.range(1, 100).parallel().forEach(x -> {
            System.out.print(x + " ");
        });
        end = System.currentTimeMillis();
        System.out.println();
        System.out.println("Total time taken to print 1 to 100 by parallel stream = "+(end - start));

        // ======================= Thread name and printing values =======================
        // Printing 1 to 100 using sequential stream with Thread Name
        start = System.currentTimeMillis();
        System.out.println("======================= Thread name and printing values =======================");
        System.out.println();
        IntStream.range(1, 100).forEach(x -> {
            System.out.println("Thread "+Thread.currentThread().getName()+" : "+x);
        });
        end = System.currentTimeMillis();
        System.out.println("Total time taken to print 1 to 100 by sequential stream with thread= "+(end - start));

        // Printing 1 to 100 using Parallel stream with Thread Name
        start = System.currentTimeMillis();
        System.out.println();
        IntStream.range(1, 100).parallel().forEach(x -> {
            System.out.println("Thread "+Thread.currentThread().getName()+" : "+x);
        });
        end = System.currentTimeMillis();
        System.out.println("Total time taken to print 1 to 100 by parallel stream with thread = "+(end - start));

        // ======================= Working with Employee Objects =======================

        System.out.println("Working with Employee Objects");

        // Creating 1000 objects of Employee and finding average salary
        start = System.currentTimeMillis();
        List<Employee> employeeList = getEmployeeList();
        employeeList.stream().map(employee -> employee.getSalary()).mapToDouble(i -> i).average();
        end = System.currentTimeMillis();
        System.out.println("Finding average salary of employee by using sequential stream "+(end - start));

        start = System.currentTimeMillis();
        List<Employee> employeeList2 = getEmployeeList();
        employeeList2.parallelStream().map(employee -> employee.getSalary()).mapToDouble(i -> i).average();
        end = System.currentTimeMillis();
        System.out.println("Finding average salary of employee by using parallel stream "+(end - start));



    }

    public static List<Employee> getEmployeeList(){
        List<Employee> employeeList = new ArrayList<>();
        for(int i = 0; i<= 1000; i++){
            employeeList.add(new Employee(i, "Employee_name"+i, new Random().nextDouble()));
        }
        return employeeList;
    }
}
