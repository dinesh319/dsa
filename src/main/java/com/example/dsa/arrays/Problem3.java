package com.example.dsa.arrays;

public class Problem3 {
    /*
        Swapping of two variables using third variable
     */

    public static void main(String args[]){
        int a = 10;
        int b = 20;
        System.out.println(a+ " " +b +" :  a and b before swap");

        int temp = a;
        a = b;
        b = temp;

        System.out.println(a+ " " +b +" :  a and b after swap");

    }
}
