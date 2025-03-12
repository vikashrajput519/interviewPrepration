package com.java8.biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerDemoByLambdaExpression {

    public static void main(String[] args) {
        BiConsumer<String,Integer> biConsumer = (firstValue, secondValue) -> {
            System.out.println("input 1 "+ firstValue +": input 2 "+ secondValue);
        };

        biConsumer.accept("test", 10);
    }
}
