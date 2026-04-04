package com.gla.WrapperClass;
import java.util.Scanner;
public class WrapperToPrimitive {
    public static void main(String[] args) {
        Double obj = 45.67;

        double a = obj;
        int i = (int) a;

        System.out.println("Double object value: " + obj);
        System.out.println("Primitive double value: " + a);
        System.out.println("Primitive int value: " + i);
}
}
