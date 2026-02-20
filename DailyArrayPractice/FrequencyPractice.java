package com.gla.DailyArrayPractice;

import java.util.Scanner;

public class FrequencyPractice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array Size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array Element:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the Number Of Count");
        int key = sc.nextInt();
        int count = 0;
        for(int i=0; i<n; i++) {
            if (arr[i] == key) {
                count++;
            }
        }
        System.out.println(key+ " appear " +count+ " times in the array");
    }
}

