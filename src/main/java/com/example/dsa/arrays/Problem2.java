package com.example.dsa.arrays;

public class Problem2 {
    /*
        second maximum element in an array
     */

    public static void main(String args[]){
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE+1;
        int [] a = {6,2,8,1,9};
        for(int i=0; i<a.length ; i++){
            if(a[i] > max){
                max2 = max;
                max = a[i];
            }else if(a[i] > max2){
                max2 = a[i];
            }
        }

        System.out.println(max + " , " + max2 +" is the first and second highest");



        // second approach
        int first = a[0];
        int second = Integer.MIN_VALUE;
        for(int i=1;i<a.length;i++){
            if(a[i] > first){
                second = first;
                first = a[i];
            }else if(a[i] > second){
                second = a[i];
            }
        }
        System.out.println(first + " , " + second +" is the first and second highest");

    }
}
