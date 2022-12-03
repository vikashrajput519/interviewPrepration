package com.learn;

import java.util.Scanner;
// Documented in word file
public class PrimeNumberCheckMethod1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number = ");

        int number = input.nextInt();
        int count = 0;

        for(int i = 1; i<= number/2; i++){
            if(number % i == 0){
                count ++;
            }
        }

        if(count > 2){
            System.out.println("Not a Prime number.");
        }else {
            System.out.println("Prime number.");
        }
    }
}
