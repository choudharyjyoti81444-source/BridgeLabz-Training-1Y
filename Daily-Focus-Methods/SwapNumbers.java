package Daily_Focus_Methods;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number a");
        int a = sc.nextInt();
        System.out.println("Enter Number b");
        int b = sc.nextInt();

        System.out.println(a+" "+b);

        int temp = a;
        a = b;
        b = temp;
        System.out.println(a+" "+b);
    }
}
