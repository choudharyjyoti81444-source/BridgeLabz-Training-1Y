package Daily_Focus_Methods;

import java.util.Scanner;
public class PassingArguments {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:" );
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        sum(x,y,z);
    }
    public static void sum(int x, int y, int z){
        System.out.println("Sum: " +(x+y+z));
    }
}
