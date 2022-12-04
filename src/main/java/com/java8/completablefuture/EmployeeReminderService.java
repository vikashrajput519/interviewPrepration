package com.java8.completablefuture;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.java8.completablefuture.dto.Employee;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class EmployeeReminderService {

    public CompletableFuture<Void> sendNewJoinerNotCompletedReminder(){

        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("fetchEmployee : " + Thread.currentThread().getName());
            return fetchEmployees();
        }).thenApplyAsync((employees) -> {
            System.out.println("filter new joiner employee  : " + Thread.currentThread().getName());
            return employees.stream()
                    .filter(employee -> "TRUE".equals(employee.getNewJoiner()))
                    .collect(Collectors.toList());
        }).thenApplyAsync((employees) -> {
            System.out.println("filter training not complete employee  : " + Thread.currentThread().getName());
            return employees.stream()
                    .filter(employee -> "TRUE".equals(employee.getLearningPending()))
                    .collect(Collectors.toList());
        }).thenApplyAsync((employees) -> {
            System.out.println("get emails  : " + Thread.currentThread().getName());
            return employees.stream().map(Employee::getEmail).collect(Collectors.toList());
        }).thenAcceptAsync((emails) -> {
            System.out.println("send email  : " + Thread.currentThread().getName());
            emails.forEach(email -> sendEmail(email));
        });
        return voidCompletableFuture;
    }

    public CompletableFuture<Void> sendNewJoinerNotCompletedReminderWithoutAsync(){

        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("fetchEmployee : " + Thread.currentThread().getName());
            return fetchEmployees();
        }).thenApply((employees) -> {
            System.out.println("filter new joiner employee  : " + Thread.currentThread().getName());
            return employees.stream()
                    .filter(employee -> "TRUE".equals(employee.getNewJoiner()))
                    .collect(Collectors.toList());
        }).thenApply((employees) -> {
            System.out.println("filter training not complete employee  : " + Thread.currentThread().getName());
            return employees.stream()
                    .filter(employee -> "TRUE".equals(employee.getLearningPending()))
                    .collect(Collectors.toList());
        }).thenApply((employees) -> {
            System.out.println("get emails  : " + Thread.currentThread().getName());
            return employees.stream().map(Employee::getEmail).collect(Collectors.toList());
        }).thenAccept((emails) -> {
            System.out.println("send email  : " + Thread.currentThread().getName());
            emails.forEach(email -> sendEmail(email));
        });
        return voidCompletableFuture;
    }

    public void sendEmail(String email){
        System.out.println("Email sending to email + "+email);
    }


    public static List<Employee> fetchEmployees() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            List<Employee> employees = mapper.readValue(new File("employees.json"), new TypeReference<List<Employee>>() {});
            System.out.println(employees);
            return mapper.readValue(new File("employees.json"), new TypeReference<List<Employee>>() {});
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        EmployeeReminderService employeeReminderService = new EmployeeReminderService();
        employeeReminderService.sendNewJoinerNotCompletedReminder();
        employeeReminderService.sendNewJoinerNotCompletedReminderWithoutAsync();
    }
}
