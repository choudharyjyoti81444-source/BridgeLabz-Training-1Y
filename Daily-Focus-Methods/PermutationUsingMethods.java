package Daily_Focus_Methods;

import java.util.Scanner;

public class PermutationUsingMethods {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n Factorial");
        int n = sc.nextInt();
        System.out.println("Enter r Factorial");
        int r = sc.nextInt();

        System.out.println(fact(n)/fact(n-r));

    }

    public static int fact(int x) {
        int xfact = 1;
        for (int i = 1; i <= x; i++) {
            xfact *= i;
        }
        return xfact;
    }
}
