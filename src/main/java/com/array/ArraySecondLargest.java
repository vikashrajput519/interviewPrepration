package com.array;
// Documented in word file
public class ArraySecondLargest {

    public static void main(String[] args) {
        int[] a = {80, 70, 90, 60, 10, 20, 90};

        int firstLargest = 0;
        int secondLargest = 0;

        for(int number : a){
            if(number > firstLargest){
                secondLargest = firstLargest;
                firstLargest = number;
            }
            // Checking this first condition because just assume there is only 2 number in list then if we will
            // not test this else first part condition then secondLargest will remain 0
            // Checking && number != firstLargest because in case of duplicate firstLargest number condition number > secondLargest
            // will be true in secondLargest also we will get fistLargest only
            else if (number > secondLargest && number != firstLargest) {
                secondLargest = number;
            }
        }

        System.out.println("Second largest = "+secondLargest);
        System.out.println("First largest = "+firstLargest);
    }
}
