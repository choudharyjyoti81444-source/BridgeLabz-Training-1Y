import java.util.Scanner;
public class NestedSideOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side A: ");
        int a = sc.nextInt();

        System.out.print("Enter side B: ");
        int b = sc.nextInt();

        System.out.print("Enter side C: ");
        int c = sc.nextInt();

        if(a+b>c && a+c>b && b+c>a){
            System.out.println("Valid Triangle");

            if(a==b && b==c){
                System.out.println("Equilateral Triangle");}
            else if(a==b || b==c || a==c){
                System.out.println("Isosceles Triangle");}
            else{
                System.out.println("Scalene Triangle");}
            }
         else {
            System.out.println("Not a valid triangle");
        }
    }
}