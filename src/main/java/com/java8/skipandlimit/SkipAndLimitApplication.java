package com.java8.skipandlimit;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class SkipAndLimitApplication {

    public static void main(String[] args) throws IOException {

        List<String> fileData = Files.readAllLines(Paths.get("data.txt"));

        // Read and print all the data of file
        fileData.forEach(System.out::println);

        // Now Remove the header of the file
        System.out.println("\n=============After Removing of header of the File=============");
        fileData.stream().skip(1).forEach(System.out::println);

        // Now Remove the header of the file
        System.out.println("\n=============After Removing of header and footer of the File=============");
        fileData.stream().skip(1).limit(fileData.size()-2).forEach(System.out::println);
    }
}
