package Daily_Focus_Methods;

import java.util.Scanner;

public class SquaringNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Elemnt");
        int n = sc.nextInt();

        System.out.println(nums(n));
    }
    public static int nums(int n){
        return n*n;
    }
}
