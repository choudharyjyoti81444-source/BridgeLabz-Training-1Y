package Daily_Focus_Methods;

import java.util.Scanner;

public class ReturnType {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        double a = sc.nextDouble();
        System.out.println("Enter a Number");
        double b = sc.nextInt();

        System.out.println(sum(a,b));
    }
    public static double sum(double a, double b){
        return a+b;
    }
}
