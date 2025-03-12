package com.general;

import java.util.Scanner;
// Documented in word file
public class GreatestAmong3Method1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number = ");
        int a = input.nextInt();

        System.out.println("Enter second number = ");
        int b = input.nextInt();

        System.out.println("Enter third number = ");
        int c = input.nextInt();



        if(a > b && a > c){
            System.out.println("First number is greater = "+a);
        } else if(b > a && b > c){
            System.out.println("Second number is greater = "+b);
        }else if(c > a && c > b){
            System.out.println("Third number is greater = "+c);
        }else{
            System.out.println("Not valid comparison.");
        }
    }
}
