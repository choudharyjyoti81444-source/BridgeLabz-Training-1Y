package Daily_Focus_Methods;

import java.util.Scanner;

public class printingInMethods {
    public static void greet(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter An Element:");
        String n = sc.nextLine();

        System.out.println(n);
    }
     public static void main(String[] args){
        greet();
     }
}
