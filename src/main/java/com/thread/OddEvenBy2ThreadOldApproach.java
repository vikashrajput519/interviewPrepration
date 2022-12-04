package com.thread;

public class OddEvenBy2ThreadOldApproach {

    public static void main(String[] args){
        Printer print = new Printer();
        Thread t1 = new Thread(new TaskEvenOdd(print, 10, false));
        Thread t2 = new Thread(new TaskEvenOdd(print, 10, true));
        t1.setName("Odd-Thread");
        t2.setName("Even-Thread");
        t1.start();
        t2.start();
    }
}

class TaskEvenOdd implements Runnable {

    private int max;
    Printer printer;
    private boolean isEven;

    TaskEvenOdd(Printer printer, int max, boolean isEven){
        this.printer = printer;
        this.max = max;
        this.isEven = isEven;
    }

    @Override
    public void run() {

        int number = (isEven == true) ? 2 : 1;

        while(number < max){

            if(isEven){
                printer.printEven(number);
            }
            else {
                printer.printOdd(number);
            }
            number+=2;
        }
    }
}

class Printer {

    boolean isOdd = true;

    synchronized void printEven(int number) {

        if(isOdd){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Even:"+number);
        isOdd = true;
        notifyAll();
    }

    synchronized void printOdd(int number) {
        if(!isOdd){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Odd:"+number);
        isOdd = false;
        notifyAll();
    }

}
