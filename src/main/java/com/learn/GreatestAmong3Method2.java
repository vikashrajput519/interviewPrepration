package com.learn;

import java.util.Scanner;
// Documented in word file
public class GreatestAmong3Method2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number = ");
        int a = input.nextInt();

        System.out.println("Enter second number = ");
        int b = input.nextInt();

        System.out.println("Enter third number = ");
        int c = input.nextInt();

        if(a>b){
            if(a > c){
                System.out.println("First number is greater = "+a);
            }else{
                System.out.println("Third number is greater = "+c);
            }
        }else if(b > c){
            System.out.println("Second number is greater = "+b);
        }else {
            System.out.println("Third number is greater = "+c);
        }

    }
}
