package Daily_Focus_Methods;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n =sc.nextInt();

        System.out.println(fact(n));
    }
    public static int fact(int x){
        int xfact = 1;
        for(int i=1; i<=x; i++){
            xfact *= i;
        }
        return xfact;
    }
}
