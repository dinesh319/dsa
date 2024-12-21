package com.example.dsa.arrays;

public class Problem9SecondApproach {

    public static void main(String args[]){
        int []a = {1,0,2,0,3,0};
        int low = 0;
        int high = 0;
        while(high<a.length){
            if(a[low] == 0){
                if(a[high] == 0){
                    high++;
                }else{
                    a[low] = a[high];
                    a[high] = 0;
                }
            }else{
                low++;
                high++;
            }
        }
    }

}
