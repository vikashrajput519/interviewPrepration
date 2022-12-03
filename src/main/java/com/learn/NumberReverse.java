package com.learn;

// Documented in word file
public class NumberReverse {

    public static void main(String[] args) {
        int num = 567;

        int d;
        int reverse = 0;

        while(num > 0){
            d = num % 10;
            reverse = reverse * 10 +d;
            num = num/10;
        }

        System.out.println("Reverse Number = "+reverse);
    }
}
