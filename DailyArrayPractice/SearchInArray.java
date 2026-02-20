package com.gla.DailyArrayPractice;

import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array Element");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Number to Search:");
        int key = sc.nextInt();

        boolean found = false;
        for(int i=0; i<n; i++){
            if(arr[i]==key){
                found = true;
                break;
            }
        }
        if(found) {
            System.out.println(key + " is present in the array");
        }
        else{
            System.out.println(key + " is not present in the array");
        }
    }
}
