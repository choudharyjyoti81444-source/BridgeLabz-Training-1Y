package Daily_Focus_Methods;

import java.util.Scanner;
public class Power {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int x = sc.nextInt();
        System.out.println("Enter Power");
        int y = sc.nextInt();

        int power = 1;

        for(int i=1; i<=y; i++){
            power *= x;
        }
        System.out.println("Result: " +power);
    }
}
