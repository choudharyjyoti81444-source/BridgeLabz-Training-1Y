package com.gla.Generics_Collections.Generic_Problem;

import java.util.*;
public class ListTransferUtility {
    public static void copyList(List<? super Number> dest, List<? extends Number> src) {
        for (int i = 0; i < src.size(); i++) {
            dest.add(src.get(i));
        }
    }

    public static void main(String[] args) {
        List<Integer> src = new ArrayList<>();
        src.add(10);
        src.add(20);
        src.add(30);

        List<Number> dest = new ArrayList<>();
        copyList(dest, src);

        System.out.println(dest);
    }
}
