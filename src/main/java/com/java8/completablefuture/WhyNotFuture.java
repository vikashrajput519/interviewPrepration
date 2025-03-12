package com.java8.completablefuture;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class WhyNotFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future<List<Integer>> submit = executorService.submit(() -> {
            return Arrays.asList(1, 2, 3, 4);
        });

        List<Integer> list = submit.get();

        list.stream().forEach(System.out::println);

        // We do not have any feature to combine, manually/forcefully complete the task we can not chain multiple futures
    }
    public static void delay(int min){
        try{
            TimeUnit.MINUTES.sleep(min);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
