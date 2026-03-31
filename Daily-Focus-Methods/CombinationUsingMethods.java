package Daily_Focus_Methods;

import java.util.Scanner;
public class CombinationUsingMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n Factorial");
        int n = sc.nextInt();
        System.out.println("Enter r Factorial");
        int r = sc.nextInt();

        int ncr = fact(n)/(fact(r)*fact(n-r));
        System.out.println(ncr);
    }

    public static int fact(int x){
        int xFact = 1;
        for (int i=1; i<=x; i++){
            xFact *= i;
        }
        return xFact;
    }
}
