package Daily_Focus_Methods;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st element");
        int a = sc.nextInt();
        System.out.println("Enter 2nd element");
        int b = sc.nextInt();

        System.out.println(sum(a, b));
    }
    public static int sum(int a,int b){
        return a+b;
    }
}
