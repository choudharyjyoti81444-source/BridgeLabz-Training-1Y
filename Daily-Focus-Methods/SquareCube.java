package Daily_Focus_Methods;

import java.util.Scanner;

public class SquareCube {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number:");
        int n = sc.nextInt();

        square(n);
        cube(n);

    }
    public static void square(int n){
        System.out.println(n*n);
    }
    public static void cube(int n){
        System.out.println(n*n*n);
    }
}
