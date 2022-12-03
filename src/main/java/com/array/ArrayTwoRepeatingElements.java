package com.array;
// Documented in word file
public class ArrayTwoRepeatingElements {

    public static void main(String[] args) {
        int arr[] = {4, 2, 4, 5, 2, 3, 1};
        int arrSize = arr.length;
        printRepeating(arr, arrSize);
    }
    static void printRepeating(int array[], int size) {
        int i, j;
        System.out.print("Repeating Elements are ");
        for (i = 0; i < size - 1; i++) {
            for (j = i + 1; j < size; j++) {
                if (array[i] == array[j])
                    System.out.print(array[i] + " ");
            }
        }
    }
}
