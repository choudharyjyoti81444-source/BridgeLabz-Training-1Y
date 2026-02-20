package com.gla.DailyArrayPractice;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entere Array Size");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter Array Element");

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Reverse Array:");
        for(int i=n-1; i>=0; i--){
            System.out.println(arr[i]+ " ");
        }
    }
}
