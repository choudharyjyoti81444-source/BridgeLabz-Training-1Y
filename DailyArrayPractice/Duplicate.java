package com.gla.DailyArrayPractice;

import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array element");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean play = false;
        int dup = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    play = true;
                    dup = arr[i];
                    break;
                }
            }
            if (play) break;
        }
        if (play) {
            System.out.println("Duplicate Number" + dup);
        }
        else {
            System.out.println("Not Duplicate");
        }
    }
}
