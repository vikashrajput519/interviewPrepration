package com.general;

import java.util.*;

public class RemoveThirdSmallestNumber {

    public static void main(String[] args) {
        TreeSet<Integer> numberList = new TreeSet<>();
        numberList.add(12);
        numberList.add(345);
        numberList.add(02);
        numberList.add(333);
        numberList.add(4454656);
        numberList.add(24);
        numberList.add(99);
        numberList.add(27);

        numberList.forEach(num ->
        {
            System.out.print(num + " ");
        });

        System.out.println("");
        int size = numberList.size() ;

       Iterator iterator = numberList.iterator();

       while (iterator.hasNext()){
           if(size - (size-2) == 2){
               iterator.remove();
           }
           iterator.next();
       }

        System.out.println(numberList.size());


        numberList.forEach(num ->
        {
            System.out.print(num + " ");
        });
    }
}
