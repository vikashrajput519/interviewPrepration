package com.java8;

import com.java8.EmployeeInterviewProgramTest;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class HighestSalaryInEachDept {
    public static void main(String[] args) {

        List<EmployeeInterviewProgramTest> employeeList =
                Arrays.asList(
                        new EmployeeInterviewProgramTest(1, "Vikash", "IT", 40000.0),
                        new EmployeeInterviewProgramTest(2, "Singh", "SOFT", 80000.0),
                        new EmployeeInterviewProgramTest(3, "Kumar", "BUSINESS", 20000.0),
                        new EmployeeInterviewProgramTest(4, "Sonu", "SECURITY", 90000.0),
                        new EmployeeInterviewProgramTest(5, "Sachin", "IT", 70000.0),
                        new EmployeeInterviewProgramTest(6, "Akash", "SECURITY", 10000.0),
                        new EmployeeInterviewProgramTest(7, "Soumya", "SOFT", 45000.0),
                        new EmployeeInterviewProgramTest(8, "Nikhil", "BUSINESS", 85000.0));

        Map<String, List<EmployeeInterviewProgramTest>> employeeFormEachDepart = employeeList.stream().collect(Collectors.groupingBy(EmployeeInterviewProgramTest::getDepartment));
        System.out.println(employeeFormEachDepart);

        // Finding Highest Salary from each department
        Comparator<EmployeeInterviewProgramTest> comparingHighestPaidSalary = Comparator.comparing(EmployeeInterviewProgramTest::getSalary);
        Map<String, Optional<EmployeeInterviewProgramTest>> employeeFormEachDepartWithHighestPaidSalary = employeeList.stream()
                .collect(Collectors.groupingBy(EmployeeInterviewProgramTest::getDepartment, Collectors.reducing(BinaryOperator.maxBy(comparingHighestPaidSalary))));
        System.out.println(employeeFormEachDepartWithHighestPaidSalary);
    }
}
