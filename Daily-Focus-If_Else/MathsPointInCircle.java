import java.util.Scanner;
public class MathsPointInCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter center coordinates (h k): ");
        int h = sc.nextInt();
        int k = sc.nextInt();
		
        System.out.print("Enter radius: ");
        int r = sc.nextInt();

        System.out.print("Enter point coordinates (x y): ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        int d =(x-h)*(x-h) + (y-k)*(y-k);
        int r2 = r*r;

        if (d<r2){
            System.out.println("Point lies inside the circle");}
        else if (d==r2){
            System.out.println("Point lies on the circle");}
        else{
            System.out.println("Point lies outside the circle");}
    }
}