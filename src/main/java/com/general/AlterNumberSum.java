package com.general;

import java.util.Scanner;
// Documented in word file
public class AlterNumberSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of term = ");
        int n = in.nextInt();
        System.out.println();
        int sum = 0;

        for(int i= 0; i<=n; i++){
            if(i%2 != 0){
                sum = sum + i;
                System.out.print(i+"+");
            }
        }
        System.out.print("\b = "+sum);
        System.out.println();
    }
}
