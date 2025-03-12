package com.general;

import java.util.Scanner;
// Documented in word file
public class PrimeNumberCheckMethod2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number = ");

        int number = input.nextInt();
        int i = 2;
        boolean isPrime = true;

        while(number > i){
            if(number % i == 0){
                isPrime = false;
                break;
            }
            i++;
        }
        if(isPrime){
            System.out.println("Prime");
        }else {
            System.out.println("Not Prime");
        }

    }
}
