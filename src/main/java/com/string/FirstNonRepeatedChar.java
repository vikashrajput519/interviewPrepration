package com.string;
// Documented in word file
public class FirstNonRepeatedChar {

    public static void main(String[] args) {
        String str = "My Name is Vikash Singh MyNm";

        int count;

        int strLength = str.length();
        for(int i = 0; i< strLength; i++){
            count = 0;
            for (int j = 0; j< strLength; j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if(count < 2 ){
                System.out.println("First non-repeated char = "+str.charAt(i));
                break;
            }
        }
    }
}
