package com.example.dsa.arrays;

public class Problem1 {


   /*
        finding maximum value in an array
    */
    public static void main(String args[]){
        int max = Integer.MIN_VALUE;
        int [] a = {6,2,8,1,9};

        for(int i=0;i<a.length;i++){
            if(a[i]> max) {
                max = a[i];
            }
        }

        System.out.println(max + " is the maximum for (6 ,2 ,8 ,1 ,9 ) " );



        // 2nd approach

        int n = a[0];
        for(int i=1;i<a.length;i++){
            if(a[i] > n){
                n=a[i];
            }
        }

        System.out.println(n + " is the maximum for (6 ,2 ,8 ,1 ,9 ) " );


    }
}
