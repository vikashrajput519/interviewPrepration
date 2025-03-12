package com.askedInInterview;

public class TwoSum {

    public static void main(String[] args) {

        int num[] = {3,2,4};

        int output[] = twoSum(num, 6);

        for(int i = 0; i< output.length; i++){
            System.out.print(output[i]+" ");
        }

        System.out.println();

    }

    public static int[] twoSum(int[] nums, int target) {

        // && (nums[i] != nums[j]) to prevent [2,5,5,11] = 10 and [3, 3] = 6
        int length = nums.length;
        for(int i = 0; i< length; i++){
            for(int j= 0+1; j< length; j++){
                if(nums[i] + nums[j] == target && (i != j)){
                    return new int[]{i, j};
                }

            }
        }
        return null;
    }
}
