package Daily_Focus_Methods;

import java.util.Scanner;

public class RecursionMethod {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n Element:");
        int n = sc.nextInt();

        System.out.println("Result: " +sum(n));
    }
    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        return (n + (sum(n-1)));
    }
}
