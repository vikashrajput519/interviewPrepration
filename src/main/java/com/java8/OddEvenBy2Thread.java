package com.java8;

import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class OddEvenBy2Thread {

    private static Object object = new Object();

    private static IntPredicate evenCondition = e -> e % 2 == 0;
    private static IntPredicate oddCondition = e -> e % 2 != 0;

    public static void main(String[] args) throws InterruptedException {

        // Odd number printer
        CompletableFuture.runAsync(() -> OddEvenBy2Thread.printNumber(oddCondition));

        // Even number printer
        CompletableFuture.runAsync(() -> OddEvenBy2Thread.printNumber(evenCondition));

        Thread.sleep(1000);
    }

    public static void printNumber(IntPredicate condition){
        IntStream.rangeClosed(1, 10).filter(condition).forEach(OddEvenBy2Thread::execute);
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
