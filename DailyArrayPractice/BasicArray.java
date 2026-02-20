package com.gla.DailyArrayPractice;

import java.sql.SQLOutput;
import java.util.Scanner;
public class BasicArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter" + n + "Element");

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are:");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]+ " ");
        }
    }
}
