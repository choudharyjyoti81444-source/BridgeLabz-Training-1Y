package Daily_Focus_Methods;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number:");
        int x = sc.nextInt();

        System.out.println("Enter 2nd Number:");
        int y = sc.nextInt();

        System.out.println("Enter 3rd Number:");
        int z = sc.nextInt();

        Largest(x,y,z);
        System.out.println(Largest(x,y,z));

    }
    public static int Largest(int x, int y, int z){
        return (Math.max(x,Math.max(y,z)));
    }

}
