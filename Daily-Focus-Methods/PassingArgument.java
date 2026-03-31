package Daily_Focus_Methods;

import java.util.Scanner;
public class PassingArgument {
     public static void greet(String name){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter an x Element");
         String x = sc.nextLine();
         System.out.println(x +name);
     }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an y Element");
        String y = sc.nextLine();
        String z = sc.nextLine();
        greet(" "+y);
        greet(" "+z);
    }
}
