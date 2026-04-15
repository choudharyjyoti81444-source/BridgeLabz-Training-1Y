package com.gla.Class_Practice.StreamApi;

interface Sum{
    int add(int a, int b);
}
interface Stringlength{
    int length(String s);
}
interface CheckNumber{
    String check(int n);
}

public class StreamApiPractice {
   /* public int stringLength(){
    }
    (String s) -> {
      return s.length();
    };*/

   /*(int a, int b) -> {
        int c=a+b;
        return c;
    };*/

    public static void main(String[] args){
        //lambda expression for sum of two Numbers
        Sum s = (int a, int b)->(a+b);
        System.out.println(s.add(10,20));

        //Lambda Expessiion for String Length
        Stringlength sl = (String a) -> {return  a.length();};
        System.out.println(sl.length( "Hello"));

        //Lambda Expression for Check +ve -ve Numbers
        CheckNumber cn = (int n) -> {
            if(n > 0) return "Positive";
            else if(n < 0) return "Negative";
            else return "Zero";
        };

        System.out.println(cn.check(10));
        System.out.println(cn.check(-5));
        System.out.println(cn.check(0));
    }
}
