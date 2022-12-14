package com.thread;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OddEvenBy2ThreadCompletableFuture {

    private static Object object = new Object();

    private static IntPredicate evenCondition = e -> e % 2 == 0;
    private static IntPredicate oddCondition = e -> e % 2 != 0;

    public static void main(String[] args) throws InterruptedException {

        // Odd number printer
        CompletableFuture.runAsync(() -> OddEvenBy2ThreadCompletableFuture.printNumber(oddCondition));

        // Even number printer
        CompletableFuture.runAsync(() -> OddEvenBy2ThreadCompletableFuture.printNumber(evenCondition));

        Thread.sleep(1000);
    }

    public static void printNumber(IntPredicate condition){

        //Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).mapToInt(e1 -> e1).filter(condition).forEach(OddEvenBy2ThreadCompletableFuture::execute);
        IntStream.rangeClosed(1, 10).filter(condition).forEach(OddEvenBy2ThreadCompletableFuture::execute);
    }

    public static void execute(int num){
        synchronized (object){
            try{
                System.out.println(Thread.currentThread().getName()+" : "+num);
                object.notify();
                object.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}
