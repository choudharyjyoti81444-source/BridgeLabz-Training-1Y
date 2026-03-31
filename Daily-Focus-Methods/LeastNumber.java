package Daily_Focus_Methods;

import java.util.Scanner;

public class LeastNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number:");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();

        System.out.println(Math.min(x,Math.max(y,z)));
    }
}
