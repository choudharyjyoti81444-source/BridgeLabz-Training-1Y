package Daily_Focus_Methods;

import java.util.Scanner;

public class FibonacciRecursion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an Element:");
        int n = sc.nextInt();

        System.out.println("Result: " +fib(n));
    }
    public static int fib(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return (fib(n-1) + fib(n-2));
    }
}
