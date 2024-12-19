package com.example.dsa.arrays;

import java.util.Arrays;

public class Problem4 {

    /*
            Reverse an array
     */

    public static void main(String args[]){
        int [] a = {1 , 2 , 3 , 4 , 5};
        System.out.println("array without reverse is " + Arrays.toString(a));

        int start = 0;
        int end = a.length-1;

        while(start<a.length/2){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }

        System.out.println("array after reverse is "+ Arrays.toString(a));

        // 2nd approach

        int low = 0;
        int high = a.length-1;
        while(low <  high){      // at middle point loop breaks which is required
            int temp = a[low];
            a[low] = a[high];
            a[high] = temp;
                low++;
                high--;
        }

        System.out.println("array after reverse is "+ Arrays.toString(a));

    }
}
