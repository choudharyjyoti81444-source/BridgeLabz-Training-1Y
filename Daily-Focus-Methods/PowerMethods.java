package Daily_Focus_Methods;

import java.util.Scanner;
public class PowerMethods {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A NUmber");
        double a = sc.nextDouble();

        System.out.println("Enter power:");
        double b = sc.nextDouble();

        System.out.println(Math.pow(a,b));

    }
}
