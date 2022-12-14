package com.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class OddEvenBy2ThreadSimpleApproach {

    private static AtomicInteger atomicInteger = new AtomicInteger(1);
    private static String evenThreadName = "Even Thread";
    private static String oddThreadName = "Odd Thread";

    public static void main(String[] args) {

        Runnable oddEvenPrinter = () -> {

            while(atomicInteger.get() < 10){
                synchronized (atomicInteger){
                    if(atomicInteger.get() % 2 == 0 && evenThreadName.equals(Thread.currentThread().getName())){
                        System.out.println(Thread.currentThread().getName()+ " : "+atomicInteger.getAndIncrement());
                    }else if(atomicInteger.get() % 2 != 0 && oddThreadName.equals(Thread.currentThread().getName())){
                        System.out.println(Thread.currentThread().getName()+ " : "+atomicInteger.getAndIncrement());
                    }
                }
            }

        };


        Thread t1 = new Thread(oddEvenPrinter);
        t1.setName(evenThreadName);
        Thread t2 = new Thread(oddEvenPrinter);
        t2.setName(oddThreadName);
        t1.start();
        t2.start();
    }
}
