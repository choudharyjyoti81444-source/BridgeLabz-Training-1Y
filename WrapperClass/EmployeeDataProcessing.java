package com.gla.WrapperClass;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeDataProcessing {
    public static void main(String[] args) {
        int[] ages = {23, 45, 19, 32, 28};
        ArrayList<Integer> list = new ArrayList<>();
        for(int age : ages) {
            list.add(age);
        }

        int youngest = Collections.min(list);
        int oldest = Collections.max(list);
        System.out.println("Youngest age = " + youngest);
        System.out.println("Oldest age = " + oldest);
    }
}
