package Daily_Focus_Methods;

import java.util.Scanner;

public class PascalTriangle {
    public static int fact(int x){
        int xfact = 1;
        for(int i=1; i<=x; i++){
            xfact *= i;
        }
        return xfact;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n Number");
        int n = sc.nextInt();

        for(int i=0; i<=n; i++){
            for(int j=0; j<=n-i; j++){//spaces
                System.out.print(" "+" ");
            }

            for(int j=0; j<=i; j++){
                System.out.print(fact(i)/(fact(j)*fact(i-j))+ "   ");
            }
            System.out.println();
        }
    }
}
