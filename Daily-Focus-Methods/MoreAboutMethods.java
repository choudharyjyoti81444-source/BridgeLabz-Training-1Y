package Daily_Focus_Methods;

import java.util.Scanner;

public class MoreAboutMethods {
    public static void phla() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i+ " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Element:");
        String x = sc.nextLine();
        System.out.println("Result: " +x);
        dushra();
        phla();
    }

    public static void dushra() {
        System.out.println("hello");

    }
}
