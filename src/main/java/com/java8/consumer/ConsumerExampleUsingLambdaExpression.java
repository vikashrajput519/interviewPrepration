package com.java8.consumer;

import java.util.function.Consumer;

public class ConsumerExampleUsingLambdaExpression {

    public static void main(String[] args) {
        // So basically "(number) -> System.out.println("The Number = "+number)" returning Consumer object
        Consumer<Integer> consumer = (number) -> System.out.println("The Number = "+number);

        // When we are passing this function from any other method like forEach then automatically this accept method will get called
        consumer.accept(10);
    }
}
