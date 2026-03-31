package Daily_Focus_Methods;

import java.util.Scanner;
public class GreatestNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 numbers:");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();

        System.out.println(Math.max(x,Math.max(y,z)));
    }
}
