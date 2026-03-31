package Daily_Focus_Methods;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Element:");
        int n = sc.nextInt();

        printfib(n);
    }
    public static void printfib(int n){
        int a=0,b=1;
        for(int i=0; i<n; i++){
            System.out.print(a+" ");
            int next = a+b;
            a=b;
            b=next;
        }
    }
}
