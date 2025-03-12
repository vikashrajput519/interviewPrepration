package com.askedInInterview;

import java.util.Random;

public class Print10RandomIntegerByUsingStream {
    public static void main(String[] args) {

        Random random = new Random(100);
        random.ints().limit(10).forEach(t -> System.out.print(t+ ", "));

    }

}
