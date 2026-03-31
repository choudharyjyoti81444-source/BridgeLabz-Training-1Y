package Daily_Focus_Methods;

import java.util.Scanner;

public class StudentID {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student name:");
        String name = sc.nextLine();
        System.out.println("Enter Student age:");
        int age = sc.nextInt();
        System.out.println("Enter Student class:");
        int Class = sc.nextInt();
        System.out.println("Enter Student Grade");
        int grade = sc.nextInt();

        Student(name,age,Class,grade);
    }
    public static void Student(String name, int age, int Class, int grade){
        System.out.println("I am " +name );
        System.out.println("My age is " +age);
        System.out.println("I am in Class " +Class);
        System.out.println("My grade is " +grade);
    }
}
