package com.gla.Class_Practice.Generics;

import java.lang.Number;
import java.util.Scanner;

public class GenericsFibonacciseriesgenerics {
    public static<T> void fib(T n){
        int num = Integer.parseInt(n.toString());
        int a=0, b=1;
        System.out.println(a+"\n"+b);
        for(int i=0; i<num; i++){
            int sum = a+b;
            System.out.println(sum);
            a=b;
            b=sum;
        }
    }

    public static<T extends Number> void fibo(T n){
        int num =n.intValue();
        //int num = Integer.parseInt(n.toString());
        int a=0, b=1;
        System.out.println(a+"\n"+b);
        for(int i = 0; i<num; i++){
            int sum = a+b;
            System.out.println(sum);
            a=b;
            b=sum;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Element: ");
        int n =sc.nextInt();

        fib(n);
        fibo(n);
    }
}
