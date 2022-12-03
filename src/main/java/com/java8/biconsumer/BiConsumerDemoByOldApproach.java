package com.java8.biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerDemoByOldApproach implements BiConsumer<String,Integer> {

    @Override
    public void accept(String i1, Integer i2) {
        System.out.println("input 1 "+i1 +": input 2 "+i2);
    }

    public static void main(String[] args) {
        BiConsumer<String,Integer> biConsumer=new BiConsumerDemoByOldApproach();
        biConsumer.accept("javatechie",53000);
    }
}
