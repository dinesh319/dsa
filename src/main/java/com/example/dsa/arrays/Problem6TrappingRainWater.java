package com.example.dsa.arrays;

import java.util.Arrays;

public class Problem6TrappingRainWater {
    /*
    https://leetcode.com/problems/trapping-rain-water/description/
    Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
    Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
    Output: 6
    Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.

     */

    public static void main(String args[]){

        int []a = {4,2,0,3,2,5};
        System.out.println(Arrays.toString(a) + " height of each building");

        int []leftMax = new int[a.length];
        leftMax[0] = a[0];
        int max = a[0];
        for(int i=1 ; i<a.length ; i++){
            if(a[i] > max){
                max = a[i];
            }
            leftMax[i] = max;
        }
        System.out.println(Arrays.toString(leftMax) + " is the left max");

        int []rightMax = new int[a.length];
        rightMax[a.length-1] = a[a.length-1];
        max = a[a.length-1];

        for(int i=a.length-2; i>=0 ;i--){
            if(a[i] > max){
                max = a[i];
            }
            rightMax[i] = max;
        }

        System.out.println(Arrays.toString(rightMax )+ " is the right max");

        int trappedRainWater = 0;

        for(int i=0;i<a.length;i++){
            trappedRainWater += (Math.min(leftMax[i] , rightMax[i]) - a[i]) * 1 ; // multiply with width of block i.e 1
        }
        System.out.println(trappedRainWater);

    }
}
