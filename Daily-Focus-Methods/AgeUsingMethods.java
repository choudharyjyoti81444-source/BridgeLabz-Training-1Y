package Daily_Focus_Methods;

import java.util.Scanner;

public class AgeUsingMethods {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Element");
        String name = sc.nextLine();
        int age = sc.nextInt();
        intro(name, age);

    }
    public static void intro(String name, int age){
        System.out.println("hello " +name+ " your age is " +age);
    }
}
