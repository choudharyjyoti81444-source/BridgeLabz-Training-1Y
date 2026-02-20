package com.gla.DailyArrayPractice;

import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array Element");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        int even = 0;
        int odd = 0;
        for(int num : arr){
            if(num%2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even number is " +even);
        System.out.println("Odd Number is " +odd);
    }
}
