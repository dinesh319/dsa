package com.example.dsa.arrays;

public class Problem8Leetcode53 {
    /*
            kadanes algorithm
     */
    public static void main(String args[]){

        int []a = {-2,1,-3,4,-1,2,1,-5,4};
        int max = Integer.MIN_VALUE;
        int subArraySum = 0;

        for(int i=0 ; i<a.length ;i++){
            subArraySum = subArraySum + a[i];
            if(subArraySum > max){
                max = subArraySum;
            }

            if(subArraySum < 0){   // adding element to negative sum will reduce the total , so making sum as 0.
                subArraySum = 0;
            }
        }

        System.out.println(max +" is the maximum subarray sum");
    }
}
