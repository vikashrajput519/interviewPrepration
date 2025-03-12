package com.general;

import java.util.Scanner;
// Documented in word file
public class SumOf2Numbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number = ");
        int a = scanner.nextInt();
        System.out.println("Enter second number = ");
        int b = scanner.nextInt();

        System.out.println("Sum of 2 Digits = " + (a+b));
    }
}
