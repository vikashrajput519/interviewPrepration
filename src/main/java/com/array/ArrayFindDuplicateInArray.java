package com.array;
// Documented in word file
public class ArrayFindDuplicateInArray {

    public static void main(String args[])
    {
        int numArray[] = { 0, 4, 3, 2, 7, 8, 2, 3, 1 };

        int arrayLength = numArray.length;

        for (int i = 0; i < numArray.length; i++) {
            numArray[numArray[i] % arrayLength] = numArray[numArray[i] % arrayLength] + arrayLength;
        }
        System.out.println("The repeating elements are : ");
        for (int i = 0; i < arrayLength; i++) {
            if (numArray[i] >= arrayLength * 2) {
                System.out.println(i + " ");
            }
        }
    }
}
