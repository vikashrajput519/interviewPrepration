package com.array;
// Documented in word file
public class ArrayFindFirstDuplicateElement {

    public static void main(String[] args) {
        int[] a = {2, 4, 3, 8 , 9, 4, 7};
        int count = 1;
        for(int i= 0; i< a.length; i++){
            for(int j = i+1; j< a.length; j++){
                if(a[i] == a[j]){
                    count ++;
                }
            }

            if(count >= 2){
                System.out.println("Duplicate found "+a[i]);
                break;
            }
        }
    }
}
