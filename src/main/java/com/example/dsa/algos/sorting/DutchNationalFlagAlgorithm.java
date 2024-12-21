package com.example.dsa.algos.sorting;

import java.util.Arrays;

public class DutchNationalFlagAlgorithm {
        /*
                https://leetcode.com/problems/sort-colors/description/
                leetcode 75
         */
    public static void main(String args[]){
        int []a = {2,0,2,1,1,0};

        int low =0;
        int mid =0;
        int high = a.length-1;

        while(mid <= high){
            if(a[mid] == 0){
               int temp = a[low];
               a[low] = a[mid];
               a[mid] = temp;
               mid++;
               low++;
            }else if(a[mid] == 1){
                mid++;
            }else{
                int temp = a[high];
                a[high] = a[mid];
                a[mid] = temp;
                high--;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
