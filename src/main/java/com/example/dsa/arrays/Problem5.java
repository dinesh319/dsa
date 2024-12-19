package com.example.dsa.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Problem5 {
    /*
        https://www.geeksforgeeks.org/reverse-an-array-in-groups-of-given-size/
        reverse an array in groups (where subgroup size is k)

        Given an array arr of positive integers. Reverse every sub-array group of size k.
Note: If at any instance, k is greater or equal to the array size, then reverse the entire array. You shouldn't return any array, modify the given array in place.

    Input: k = 3, arr= [1, 2, 3, 4, 5]
Output: [3, 2, 1, 5, 4]
Explanation: First group consists of elements 1, 2, 3. Second group consists of 4,5.


Input: k = 5, arr = [5, 6, 8, 9]
Output: [9, 8, 6, 5]
Explnation: Since k is greater than array size, the entire array is reversed.
     */

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int []a = {5, 6 , 8 ,9};
        System.out.println("enter the sub array size where k > 0");
        int k = scan.nextInt();

        if(k == 1){
            System.out.println(Arrays.toString(a));
            return;
        }else if(k >= a.length){
            reverse(a , 0 , a.length-1);
            System.out.println(Arrays.toString(a));
            return;
        } else if ( k > 1 ) {

            int low =0;
            int high = low+k-1;

            // this code is for setting up the index
            while(low < a.length){
                reverse(a , low , high);
                 low = high+1;
                 high = low+k-1;

                 // when high goes out of an array you should change the index to a.length-1
                if(high > a.length-1){
                    high = a.length-1;
                }
            }
            System.out.println(Arrays.toString(a));
            return;
        }

    }

//  this part is used for reversing the sub array
    static void reverse(int [] a, int start , int end){
        while(start<end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
}
