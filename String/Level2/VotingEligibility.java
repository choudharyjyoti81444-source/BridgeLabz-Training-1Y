package com.gla.String.Level2;
import java.util.Random;
import java.util.Scanner;

public class VotingEligibility {
    public static int[] generateAges(int n) {
        Random random = new Random();
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            ages[i] = 10 + random.nextInt(90);
        }

        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            boolean canVote = false;

            if (age >= 0) {
                if (age >= 18) {
                    canVote = true;
                }
            } else {
                canVote = false;
            }

            result[i][0] = String.valueOf(age);
            result[i][1] = String.valueOf(canVote);
        }

        return result;
    }

    public static void display(String[][] data) {
        System.out.println("Age\tCan Vote");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] ages = generateAges(n);
        String[][] result = checkVotingEligibility(ages);

        display(result);
    }

}
