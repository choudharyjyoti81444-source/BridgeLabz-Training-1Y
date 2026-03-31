package Daily_Focus_Methods;

import java.util.Scanner;

public class MethodOverloading {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a element:");
        int a = sc.nextInt();

        System.out.println("Enter b element:");
        int b = sc.nextInt();

        System.out.println("Enter c element:");
        int c = sc.nextInt();

        System.out.println("add1: " +(add(a,b)));
        System.out.println("add2: " +(add(a,b,c)));
    }

    public static int add(int a, int b){
        return a+b;
    }

    public static int add(int a,int b,int c){
        return a+b+c;
    }
}
