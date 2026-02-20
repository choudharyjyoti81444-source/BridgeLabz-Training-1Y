package com.gla.DailyArrayPractice;

import java.util.Scanner;

public class ArraysProgram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter Array Element");

        int sum = 0;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            sum = sum+arr[i];
        }

        int max = arr[0];
        int min = arr[0];
        for(int i=0; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        double average = sum/(double) n;

        System.out.println("Array sum" +sum);
        System.out.println("Array max" +max);
        System.out.println("Array min" +min);
        System.out.println("Array average" +average);

    }
}
