package com.gla.DailyArrayPractice;

import java.util.Scanner;

public class MinArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array element: ");

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        for(int i=0; i<n; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("minimum Array is : " +min);
    }
}
