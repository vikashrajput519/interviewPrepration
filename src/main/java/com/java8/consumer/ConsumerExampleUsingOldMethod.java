package com.java8.consumer;

import java.util.function.Consumer;

public class ConsumerExampleUsingOldMethod implements Consumer<Integer> {

    @Override
    public void accept(Integer integer){
        System.out.println("The Number = "+integer);

    }

    public static void main(String[] args) {
        ConsumerExampleUsingOldMethod consumerExampleUsingOldMethod = new ConsumerExampleUsingOldMethod();
        consumerExampleUsingOldMethod.accept(10);

    }
}
