package com.gla.Generics_Collections.Map_Assignment;

public class MergeSimple {
    public static void main(String[] args) {

        String[] key1 = {"A", "B"};
        int[] val1 = {1, 2};

        String[] key2 = {"B", "C"};
        int[] val2 = {3, 4};

        String[] resKey = new String[10];
        int[] resVal = new int[10];
        int size = 0;

        for (int i = 0; i < key1.length; i++) {
            resKey[size] = key1[i];
            resVal[size] = val1[i];
            size++;
        }

        for (int i = 0; i < key2.length; i++) {
            boolean found = false;
            for (int j = 0; j < size; j++) {
                if (key2[i].equals(resKey[j])) {
                    resVal[j] = resVal[j] + val2[i];
                    found = true;
                    break;
                }
            }

            if (!found) {
                resKey[size] = key2[i];
                resVal[size] = val2[i];
                size++;
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.println(resKey[i] + " = " + resVal[i]);
        }
    }
}
