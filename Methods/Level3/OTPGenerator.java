package com.gla.Methods.Level3;
import java.util.HashSet;
import java.util.Scanner;
public class OTPGenerator {
    public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000); // Generates a 6-digit number
    }

    public static boolean areUnique(int[] otps) {
        HashSet<Integer> set = new HashSet<>();
        for (int otp : otps) {
            if (!set.add(otp)) return false; // Duplicate found
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];

        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
        }

        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }

        if (areUnique(otps)) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Some OTPs are duplicates. Regenerate OTPs.");
        }
    }
}
