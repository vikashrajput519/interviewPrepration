package com.general;

import java.util.Scanner;
// Documented in word file
public class FactorialMethod2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number = ");
        int num = input.nextInt();
        System.out.println();

        int factorial = factorial(num);
        System.out.println("\b = "+factorial);

    }
    private static int factorial(int num){
        if(num == 1){
            System.out.print(num+"*");
            return 1;
        }
        else{
            System.out.print(num+"*");
            return num* factorial(num-1);
        }
    }
}
