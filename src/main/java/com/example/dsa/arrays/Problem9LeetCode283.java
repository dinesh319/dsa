package com.example.dsa.arrays;

import java.util.Arrays;

public class Problem9LeetCode283 {
    /*
    https://leetcode.com/problems/move-zeroes/description/
            Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.


     */

    public static void main(String args[]){
        int []a = {1,0,2,0,3,0};

        int index = 0;
        for(int i=0;i<a.length;i++){
            if(a[i] !=0){
                a[index] = a[i];
                index++;
            }
        }

        while(index < a.length){
            a[index++] = 0;
        }

        System.out.println(Arrays.toString(a) + " after zeros moved to end");
    }
}
