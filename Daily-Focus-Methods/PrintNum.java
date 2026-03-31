package Daily_Focus_Methods;

import java.util.Scanner;

public class PrintNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter an Element:");
         int n = sc.nextInt();
         nums(n);
    }
    public static void nums(int n){
        System.out.println("num: " +n);
    }
}
