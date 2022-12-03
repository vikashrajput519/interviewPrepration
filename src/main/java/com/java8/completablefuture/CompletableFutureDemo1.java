package com.java8.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureDemo1 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // How to create object and get and manually complete the execution
        CompletableFuture<String> completableFuture = new CompletableFuture<>();
        // Here we are blocking the thread to get the result
        completableFuture.get();
        // if get is taking more time than we can complete the thread by
        // using compete() method as below
        completableFuture.complete("Return some dummy data...");
    }
}
