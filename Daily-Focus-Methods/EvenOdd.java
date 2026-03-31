package Daily_Focus_Methods;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Element:");
        int n = sc.nextInt();

        checkEvenOdd(n);
    }

    public static void checkEvenOdd(int n){
        if(n%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
