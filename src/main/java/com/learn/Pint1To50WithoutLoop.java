package com.learn;
// Documented in word file
public class Pint1To50WithoutLoop {

    public static void main(String[] args) {
        print(1);
    }

    public static void print(int num){
        System.out.print(num + " ");
        if(num < 50) {
            print(num+1);
        }
    }
}
