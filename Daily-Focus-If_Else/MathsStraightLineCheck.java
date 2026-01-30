import java.util.Scanner;
public class MathsStraightLineCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1 y1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.print("Enter x2 y2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.print("Enter x3 y3: ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        if(x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2)== 0) {
		    System.out.println("The points lie on a straight line");}
        else{
		    System.out.println("The points do NOT lie on a straight line");}
    }
}