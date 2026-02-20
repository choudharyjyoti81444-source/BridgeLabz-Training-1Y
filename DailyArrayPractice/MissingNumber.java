package com.gla.DailyArrayPractice;

import java.util.Scanner;
public class MissingNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size :");
        int n = sc.nextInt();

        int[] arr = new int [n];
        System.out.print("Enter Array Element :");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int exceptedSum = n*(n+1)/2;
        int actualSum = 0;
        for(int i=0; i<n; i++){
            actualSum += arr[i];
        }
        int missing = exceptedSum - actualSum;
        System.out.println("Missing Element is :" +missing);

    }
}
