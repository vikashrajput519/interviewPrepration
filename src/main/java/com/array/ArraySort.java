package com.array;
// Documented in word file
public class ArraySort {

    public static void main(String[] args) {

        Integer[] intArray = {80, 40, 50, 20, 30, 10, 70, 60};

        for(int i=0; i<intArray.length; i++){
            for(int j = i+ 1; j< intArray.length; j++){
                if(intArray[i] > intArray[j]){
                    int temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }

        for(int i=0; i<intArray.length; i++){
            System.out.print(intArray[i]+" ");
        }
    }
}
