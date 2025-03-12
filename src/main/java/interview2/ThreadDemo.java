package interview2;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadDemo {

    static AtomicInteger atomicInteger = new AtomicInteger(1);

    static volatile int counter = 0;

    public static void main(String[] args) {

        Runnable printer = new Runnable() {
            @Override
            public void run() {
                while (atomicInteger.get() < 10){

                    synchronized (atomicInteger){
                        counter ++;
                        System.out.println("Number Printed by "+ Thread.currentThread().getName() + " - "+ atomicInteger.get());

                        if(counter == 2){
                            atomicInteger.getAndIncrement();
                            counter = 0;
                        }

                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        };

        Thread firstThread = new Thread(printer);
        firstThread.setName("FIRST_THREAD");
        firstThread.start();


        Thread secondThread = new Thread(printer);
        secondThread.setName("SECOND_THREAD");
        secondThread.start();
    }
}
