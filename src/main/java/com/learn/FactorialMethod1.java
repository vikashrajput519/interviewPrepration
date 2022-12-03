package com.learn;

import java.util.Scanner;
// Documented in word file
public class FactorialMethod1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number = ");
        int n = input.nextInt();
        int fact = 1;
        System.out.println();
        for(int i=1; i<=n; i++){
            fact = fact*i;
            System.out.print(i +"*");
        }
        System.out.print("\b = "+fact);
        System.out.println();
    }
}
